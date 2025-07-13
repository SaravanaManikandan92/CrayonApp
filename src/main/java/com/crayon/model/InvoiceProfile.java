package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoiceProfile {
    public InvoiceProfile()
    {}

    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
}
