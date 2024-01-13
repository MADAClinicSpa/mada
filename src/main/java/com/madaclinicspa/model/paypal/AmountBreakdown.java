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
public class AmountBreakdown {
    @JsonProperty("discount")
    private Money discount;
    @JsonProperty("handling")
    private Money handling;
    @JsonProperty("insurance")
    private Money insurance;
    @JsonProperty("item_total")
    private Money itemTotal;
    @JsonProperty("shipping")
    private Money shipping;
    @JsonProperty("shipping_discount")
    private Money shippingDiscount;
    @JsonProperty("tax_total")
    private Money taxTotal;

}