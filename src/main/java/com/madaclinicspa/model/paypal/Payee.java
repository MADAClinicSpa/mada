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
public class Payee {
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("email_address")
    private String email;
    @JsonProperty("merchant_id")
    private String merchantId;
    @JsonProperty("display_data")
    private PayeeDisplayable payeeDisplayable;
}