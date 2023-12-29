package com.madaclinicspa.model;

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
public class MerchantReceivableBreakdown {
    @JsonProperty("gross_amount")
    private Money grossAmount;
    @JsonProperty("net_amount")
    private Money netAmount;
    @JsonProperty("paypal_fee")
    private Money paypalFee;
    @JsonProperty("platform_fees")
    private List<PlatformFee> platformFees;
    @JsonProperty("receivable_amount")
    private Money receivableAmount;
}
