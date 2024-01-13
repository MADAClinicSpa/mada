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
public class Payer {
    @JsonProperty("address")
    private AddressPortable addressPortable;
    @JsonProperty("birth_date")
    private String birthDate;
    @JsonProperty("email_address")
    private String email;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("payer_id")
    private String payerId;
    @JsonProperty("phone")
    private PhoneWithType phoneWithType;
    @JsonProperty("tax_info")
    private TaxInfo taxInfo;
}