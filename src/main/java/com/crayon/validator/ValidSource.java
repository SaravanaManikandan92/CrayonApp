package com.crayon.validator;

import com.crayon.validator.impl.ValidSourceImpl;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidSourceImpl.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
public @interface ValidSource {

    String message() default "Must be valid source";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
