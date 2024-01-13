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
public class CapturePayment {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("payment_source")
    private PaymentSource paymentSource;
    @JsonProperty("purchase_units")
    private List<PurchaseUnit> purchaseUnits;
    @JsonProperty("payer")
    private Payer payer;
    @JsonProperty("links")
    private List<LinkDescription> links;
}
