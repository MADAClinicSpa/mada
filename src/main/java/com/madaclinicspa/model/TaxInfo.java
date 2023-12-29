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
public class TaxInfo {
    @JsonProperty("tax_id")
    private String taxId;
    @JsonProperty("tax_id_type")
    private String taxIdType;
}
