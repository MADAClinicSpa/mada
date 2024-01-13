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
public class PayeeDisplayable {
    @JsonProperty("brand_name")
    private String brandName;
    @JsonProperty("business_phone")
    private Phone businessPhone;
    @JsonProperty("business_email")
    private String email;
}
