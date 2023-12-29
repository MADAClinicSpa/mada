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
public class LinkDescription {
    @JsonProperty("encType")
    private String encType;
    @JsonProperty("href")
    private String href;
    @JsonProperty("mediaType")
    private String mediaType;
    @JsonProperty("method")
    private String method;
    @JsonProperty("rel")
    private String rel;
    @JsonProperty("schema")
    private LinkSchema schema;
    @JsonProperty("targetSchema")
    private LinkSchema targetSchema;
    @JsonProperty("title")
    private String title;
}
