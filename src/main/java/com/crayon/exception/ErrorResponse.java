package com.crayon.exception;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ErrorResponse {

    private String message;

    public ErrorResponse(String message ) {
        this.message = message;
    }

}
