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
public class OrderRequest {

    @JsonProperty("intent")
    private String checkoutPaymentIntent;

    @JsonProperty("purchase_units")
    private List<PurchaseUnitRequest> purchaseUnits;

    @JsonProperty("application_context")
    private ApplicationContext applicationContext;

    @JsonProperty("payer")
    private Payer payer;

    @JsonProperty("processing_instruction")
    private String processingInstruction;
}