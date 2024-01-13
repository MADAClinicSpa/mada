package com.madaclinicspa.controller;

import com.madaclinicspa.model.paypal.Capture;
import com.madaclinicspa.model.paypal.CapturePayment;
import com.madaclinicspa.model.paypal.Order;
import com.madaclinicspa.model.paypal.OrderRequest;
import com.madaclinicspa.service.PayPalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
public class PayPalController {

    private final PayPalService payPalService;

    public PayPalController(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

   /* @RequestMapping(value="/api/orders", method = RequestMethod.POST)
    @CrossOrigin
    public Object createOrder() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);

        //JSON String
       // String requestJson = "{\"intent\":\"CAPTURE\",\"purchase_units\":[{\"amount\":{\"currency_code\":\"USD\",\"value\":\"100.00\"}}]}";
        HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);

        ResponseEntity<Object> response = restTemplate.exchange(
                BASE + "/v2/checkout/orders",
                HttpMethod.POST,
                entity,
                Object.class
        );

        if (response.getStatusCode() == HttpStatus.CREATED) {
            LOGGER.log(Level.INFO, "ORDER CAPTURE");
            return response.getBody();
        } else {
            LOGGER.log(Level.INFO, "FAILED CAPTURING ORDER");
            return "Unavailable to get CAPTURE ORDER, STATUS CODE " + response.getStatusCode();
        }

    }*/

    @PostMapping ("/api/orders")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest) {
        try {
            log.info("Creating Order");
            Optional<Order> order = payPalService.createOrder(orderRequest);
            return order.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.unprocessableEntity().build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping ("/api/capture-order/{orderId}")
    public ResponseEntity<CapturePayment> captureOrderPayment(@PathVariable(value = "orderId") String orderId) {
        try {
            log.info("Capture Order");
            Optional<CapturePayment> captureOrderPayment = payPalService.captureOrderPayment(orderId);
            return captureOrderPayment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.unprocessableEntity().build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
