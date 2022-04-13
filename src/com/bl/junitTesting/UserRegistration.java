package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean password() {
        boolean matchesString = Pattern.matches("^[a-z]{8}$","mkspasha");
        return matchesString;
    }
}
