package com.madaclinicspa.model.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    @JsonProperty("intent")
    private String checkoutPaymentIntent;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("expiration_time")
    private String expirationTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("links")
    private List<LinkDescription> links;
    @JsonProperty("payer")
    private Payer payer;
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    @JsonProperty("status")
    private String status;
    @JsonProperty("update_time")
    private String updateTime;
}