package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean lastName() {
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "Pasha");
        return matchesString;
    }
}
