package com.airtribe.learntrack.util;

import com.airtribe.learntrack.exception.InvalidInputException;

public class InputValidator {

    public static void requireNonEmpty(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new InvalidInputException(field + " cannot be empty");
        }
    }
}
