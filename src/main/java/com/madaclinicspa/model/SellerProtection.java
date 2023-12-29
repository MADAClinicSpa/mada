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
public class SellerProtection {
    @JsonProperty("dispute_categories")
    private List<String> disputeCategories;
    @JsonProperty("status")
    private String status;
}