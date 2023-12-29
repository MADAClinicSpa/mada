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
public class Media {
    @JsonProperty("binaryEncoding")
    private String binaryEncoding;
    @JsonProperty("type")
    private String type;
}
