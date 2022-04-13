package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenEmailWhenShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.email();
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
