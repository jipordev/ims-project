package co.cstad.util.validation;

import co.cstad.exception.StringInputException;

public class ValidateStringInput {
    public static void validateStringInput(String input) {
        if (input == null || input.isEmpty() ) {
            throw new StringInputException("Invalid String input");
        }
    }
}
