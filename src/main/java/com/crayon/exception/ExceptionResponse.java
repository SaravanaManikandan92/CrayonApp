package com.crayon.exception;

import org.apache.logging.log4j.util.InternalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionResponse {

    @ExceptionHandler(InternalException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(InternalException ex) {
        ErrorResponse response = new ErrorResponse(ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }


//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<?> handleValidation(
//            MethodArgumentNotValidException ex) {
//
//        System.out.println("========== VALIDATION ERROR ==========");
//
//        ex.getBindingResult().getFieldErrors().forEach(error -> {
//
//            System.out.println("Field          : " + error.getField());
//            System.out.println("Rejected Value : " + error.getRejectedValue());
//            System.out.println("Message        : " + error.getDefaultMessage());
//        });
//
//        return ResponseEntity.badRequest().body(
//                ex.getBindingResult().getFieldErrors()
//        );
//    }
}
