package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean email() {
        boolean matchesString = Pattern.matches("^[A-Za-z._]+[@]{1}[a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$", "mkspasha.xyz@gmail.com");
        return matchesString;
    }
}
