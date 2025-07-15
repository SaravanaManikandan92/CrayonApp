package com.crayon.model.duplicates;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Product {


    @JsonProperty("PartNumber")
    private String partNumber;


    @JsonProperty("Id")
    private int id;

    @JsonProperty("ItemLegalName")
    private String itemLegalName;

    @JsonProperty("ItemName")
    private String itemName;
}
