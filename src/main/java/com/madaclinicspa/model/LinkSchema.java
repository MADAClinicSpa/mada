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
public class LinkSchema {
    @JsonProperty("additionalItems")
    private Object additionalItems;
    @JsonProperty("definitions")
    private Object definitions;
    @JsonProperty("dependencies")
    private Object dependencies;
    @JsonProperty("fragmentResolution")
    private String fragmentResolution;
    @JsonProperty("items")
    private Object items;
    @JsonProperty("media")
    private Media media;
    @JsonProperty("not")
    private Object not;
    @JsonProperty("pathStart")
    private String pathStart;
    @JsonProperty("patternProperties")
    private Object patternProperties;
    @JsonProperty("properties")
    private Object properties;
}
