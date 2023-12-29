package com.madaclinicspa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.paypal.orders.CaptureStatusDetails;
import com.paypal.orders.MerchantReceivableBreakdown;
import com.paypal.orders.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Capture {
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("status_details")
    private CaptureStatusDetails captureStatusDetails;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("disbursement_mode")
    private String disbursementMode;
    @JsonProperty("final_capture")
    private Boolean finalCapture;
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("invoice_id")
    private String invoiceId;

    @JsonProperty("links")
    private List<LinkDescription> links;
    @JsonProperty("seller_protection")
    private SellerProtection sellerProtection;
    @JsonProperty("seller_receivable_breakdown")
    private MerchantReceivableBreakdown sellerReceivableBreakdown;
    @JsonProperty("status")
    private String status;
    @JsonProperty("update_time")
    private String updateTime;
}