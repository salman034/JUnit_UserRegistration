package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean passwordRule2() {
        boolean matchesString = Pattern.matches("^[A-Z{1}a-z]{8}$","Mkspasha");
        return matchesString;
    }
}
