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
public class PhoneWithType {
    @JsonProperty("phone_number")
    private Phone phoneNumber;
    @JsonProperty("phone_type")
    private String phoneType;
}