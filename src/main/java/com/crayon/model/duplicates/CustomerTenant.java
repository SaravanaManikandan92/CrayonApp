package com.crayon.model.duplicates;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class CustomerTenant {

    @NotBlank(message="Id should not be null")
    @JsonProperty("Id")
    private int id;

    @NotBlank(message="PublisherCustomerId should not be null")
    @JsonProperty("PublisherCustomerId")
    private String publisherCustomerId;
}
