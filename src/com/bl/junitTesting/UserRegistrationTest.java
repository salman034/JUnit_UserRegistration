package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPhoneNumberWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.phoneNumber();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
