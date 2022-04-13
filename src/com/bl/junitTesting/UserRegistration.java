package com.bl.junitTesting;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean passwordRule4() {
        boolean matchesString = Pattern.matches("^([~!@#$%^&*()+{}]?[A-Za-z0-9]){8,}$", "Salman@7744");
        return matchesString;
    }
}
