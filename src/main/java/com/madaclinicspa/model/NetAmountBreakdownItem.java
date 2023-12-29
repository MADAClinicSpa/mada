package com.madaclinicspa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NetAmountBreakdownItem {
    @JsonProperty("converted_amount")
    private Money convertedAmount;
    @JsonProperty("payable_amount")
    private Money payableAmount;
}