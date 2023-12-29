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
public class PaymentCollection {
    @JsonProperty("authorizations")
    private List<Authorization> authorizations;
    @JsonProperty("captures")
    private List<Capture> captures;
    @JsonProperty("refunds")
    private List<Refund> refunds;
}