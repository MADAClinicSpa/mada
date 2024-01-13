package com.madaclinicspa.service.impl;

import com.madaclinicspa.model.paypal.*;
import com.madaclinicspa.service.PayPalService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.Optional;

import static java.util.Objects.nonNull;

@Service
@Slf4j
public class PayPalServiceImpl implements PayPalService {

    private final String  BASE = "https://api-m.sandbox.paypal.com";

    @Value("${paypal.client.id}")
    private String paypalClientId;

    @Value("${paypal.client.secret}")
    private String paypalClientSecret;

    @Autowired
    private RestTemplate restTemplate;

    private String getAuth(String client_id, String app_secret) {
        String auth = client_id + ":" + app_secret;
        return Base64.getEncoder().encodeToString(auth.getBytes());
    }

    private Optional<String> generateAccessToken() {
        String auth = getAuth(paypalClientId, paypalClientSecret);
        HttpEntity<?> request = createHeadersForToken(auth);
       /* HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("Authorization", "Basic " + auth);

        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        HttpEntity<?> request = new HttpEntity<>(requestBody, headers);
        requestBody.add("grant_type", "client_credentials");*/
        ResponseEntity<PayPalToken> response = restTemplate.exchange(BASE + "/v1/oauth2/token", HttpMethod.POST, request, new ParameterizedTypeReference<PayPalToken>() {});

        if (nonNull(response.getBody()) && response.getStatusCode() == HttpStatus.OK) {
            log.info("GET TOKEN: SUCCESSFUL!");
            return Optional.of(response.getBody().getAccessToken());
        } else {
            log.info("GET TOKEN: FAILED!");
            return Optional.empty();
        }
    }

    private HttpEntity<?> createHeadersForToken(String auth) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("Authorization", "Basic " + auth);
        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        requestBody.add("grant_type", "client_credentials");
        return new HttpEntity<>(requestBody, headers);
    }

    private HttpEntity<OrderRequest> createHeadersForOrders(String accessToken, OrderRequest ordersCreateRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<OrderRequest>(ordersCreateRequest, headers);
    }

    private HttpEntity<?> createHeaders(String accessToken) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(headers);
    }

    @Override
    public Optional<Order> createOrder(OrderRequest orderRequest) {
        Optional<String> payPalToken = generateAccessToken();
        if (payPalToken.isPresent()) {
            HttpEntity<OrderRequest> entity = createHeadersForOrders(payPalToken.get(), orderRequest);
            ResponseEntity<Order> response = restTemplate.exchange(
                    BASE + "/v2/checkout/orders",
                    HttpMethod.POST,
                    entity,
                    new ParameterizedTypeReference<Order>() {
                    });
            if (nonNull(response.getBody())) {
                return Optional.of(response.getBody());
            } else {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<CapturePayment> captureOrderPayment(String orderId) {
        Optional<String> payPalToken = generateAccessToken();
        if (payPalToken.isPresent()) {
            HttpEntity<?> entity = createHeaders(payPalToken.get());
            ResponseEntity<CapturePayment> response = restTemplate.exchange(
                    BASE + "/v2/checkout/orders/" + orderId + "/capture",
                    HttpMethod.POST,
                    entity,
                    new ParameterizedTypeReference<CapturePayment>() {
                    });
            if (nonNull(response.getBody())) {
                return Optional.of(response.getBody());
            } else {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}