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
public class Name {
    @JsonProperty("alternate_full_name")
    private String alternateFullName;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("prefix")
    private String prefix;
    @JsonProperty("suffix")
    private String suffix;
    @JsonProperty("surname")
    private String surname;
}