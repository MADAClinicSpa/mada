package com.madaclinicspa.model;

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
public class ShippingDetail {
    @JsonProperty("address")
    private AddressPortable addressPortable;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("options")
    private List<ShippingOption> options;
}