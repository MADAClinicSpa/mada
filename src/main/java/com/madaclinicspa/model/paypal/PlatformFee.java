package com.madaclinicspa.model.paypal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.paypal.orders.PayeeBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlatformFee {
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("payee")
    private PayeeBase payeeBase;
}
