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
public class PayPalAccount {
    @JsonProperty("email")
    private String email;
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("account_status")
    private String accountStatus;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("address")
    private AddressPortable addressPortable;
}
