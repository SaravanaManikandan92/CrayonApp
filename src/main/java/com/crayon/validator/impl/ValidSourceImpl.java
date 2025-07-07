package com.crayon.validator.impl;

import com.crayon.constants.Constants;
import com.crayon.validator.ValidSource;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidSourceImpl implements ConstraintValidator<ValidSource, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value!=null && !value.isEmpty() && !value.isBlank() && Constants.clientList.contains(value.toLowerCase());
    }
}
