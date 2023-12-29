package com.madaclinicspa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddressPortable {
    @JsonProperty("address_line_1")
    private String addressLine1;
    @JsonProperty("address_line_2")
    private String addressLine2;
    @JsonProperty("address_line_3")
    private String addressLine3;
    @JsonProperty("admin_area_1")
    private String adminArea1;
    @JsonProperty("admin_area_2")
    private String adminArea2;
    @JsonProperty("admin_area_3")
    private String adminArea3;
    @JsonProperty("admin_area_4")
    private String adminArea4;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("postal_code")
    private String postalCode;
}
