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
public class AmountWithBreakdown {
    @JsonProperty("breakdown")
    private AmountBreakdown amountBreakdown;
    @JsonProperty("currency_code")
    private String currencyCode;
    @JsonProperty("value")
    private String value;
}
