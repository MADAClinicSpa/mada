package com.madaclinicspa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Refund {
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("links")
    private List<LinkDescription> links;
    @JsonProperty("note_to_payer")
    private String noteToPayer;
    @JsonProperty("status_details")
    private RefundStatusDetails refundStatusDetails;
    @JsonProperty("seller_payable_breakdown")
    private MerchantPayableBreakdown sellerPayableBreakdown;
    @JsonProperty("status")
    private String status;
    @JsonProperty("update_time")
    private String updateTime;
}