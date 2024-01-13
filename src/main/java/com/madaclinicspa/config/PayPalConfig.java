package com.madaclinicspa.config;

import org.springframework.beans.factory.annotation.Value;

public class PayPalConfig {

    @Value("${paypal.client.id}")
    private String clientId;
    @Value("${paypal.client.secret}")
    private String clientSecret;
    @Value("${paypal.mode}")
    private String mode;
}
