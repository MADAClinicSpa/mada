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
public class Item {
    @JsonProperty("category")
    private String category;
    @JsonProperty("description")
    private String description;
    @JsonProperty("name")
    private String name;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("tax")
    private Money tax;
    @JsonProperty("unit_amount")
    private Money unitAmount;
}
