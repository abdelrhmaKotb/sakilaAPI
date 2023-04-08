package gov.iti.jets.services.validation;

import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidatorHandler {
    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private static final Validator validator = factory.getValidator();

    private ValidatorHandler() {
    }

    public static Validator getValidator() {
        return validator;
    }

    public static <T> String getErrorMessage(Set<ConstraintViolation<T>> violations) {
        return violations.stream().map(e -> e.getMessage()).collect(Collectors.joining("; "));
    }
}
