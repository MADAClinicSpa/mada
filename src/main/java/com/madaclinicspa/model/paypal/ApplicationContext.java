package com.madaclinicspa.model.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApplicationContext {
    @JsonProperty("brand_name")
    private String brandName;
    @JsonProperty("cancel_url")
    private String cancelUrl;
    @JsonProperty("landing_page")
    private String landingPage;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;
    @JsonProperty("payment_token")
    private String paymentToken;
    @JsonProperty("return_url")
    private String returnUrl;
    @JsonProperty("shipping_preference")
    private String shippingPreference;
    @JsonProperty("user_action")
    private String userAction;
}
