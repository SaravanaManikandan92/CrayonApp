package com.crayon.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Organization {
    public Organization()
    {}


    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;
}
