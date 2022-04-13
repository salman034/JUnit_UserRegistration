package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordAtlestOneUpperCaseWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordRule2();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
