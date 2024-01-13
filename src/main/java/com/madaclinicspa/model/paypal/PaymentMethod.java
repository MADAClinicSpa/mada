package com.madaclinicspa.model.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentMethod {
    @JsonProperty("payee_preferred")
    private String payeePreferred;
    @JsonProperty("payer_selected")
    private String payerSelected;
}

