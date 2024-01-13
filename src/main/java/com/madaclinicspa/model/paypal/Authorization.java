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
public class Authorization {
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("status_details")
    private AuthorizationStatusDetails authorizationStatusDetails;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("expiration_time")
    private String expirationTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("links")
    private List<LinkDescription> links;
    @JsonProperty("seller_protection")
    private SellerProtection sellerProtection;
    @JsonProperty("status")
    private String status;
    @JsonProperty("update_time")
    private String updateTime;
}