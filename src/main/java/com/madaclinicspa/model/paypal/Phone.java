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
public class Phone {
    @JsonProperty("country_code")
    private String countryCallingCode;
    @JsonProperty("extension_number")
    private String extensionNumber;
    @JsonProperty("national_number")
    private String nationalNumber;
}
