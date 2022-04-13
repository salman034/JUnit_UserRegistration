package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean phoneNumber() {
        boolean matchesString = Pattern.matches("^[0-9]{2}[ ][789]{1}[0-9]{9}$","91 9845715264");
        return matchesString;
    }
}
