package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Publisher {

    public Publisher()
    {}

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
}
