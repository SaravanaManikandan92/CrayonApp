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


    @NotBlank(message="PartNumber should not be null")
    @JsonProperty("PartNumber")
    private String partNumber;


    @NotBlank(message="Id should not be null")
    @JsonProperty("Id")
    private String id;

    @NotBlank(message="ItemLegalName should not be null")
    @JsonProperty("ItemLegalName")
    private String itemLegalName;

    @NotBlank(message="ItemName should not be null")
    @JsonProperty("ItemName")
    private String itemName;
}
