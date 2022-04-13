package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName() {
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "Salman");
        return matchesString;
    }
}
