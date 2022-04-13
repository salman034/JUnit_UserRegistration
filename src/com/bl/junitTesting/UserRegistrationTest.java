package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordAtlestOneNumericWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordRule3();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
