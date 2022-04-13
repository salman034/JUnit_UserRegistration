package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPasswordShouldReturnTrueWhenSpecialCharacterHaveTakeAnyOne() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("abc+100@gmail.com");
        System.out.println(userTest);
        Assert.assertTrue(userTest);
    }
}
