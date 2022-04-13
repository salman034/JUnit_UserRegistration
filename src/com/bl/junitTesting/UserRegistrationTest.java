package com.bl.junitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenFirstNameWhenPropershouldReturnTrue() {
        UserRegistration userDetails = new UserRegistration();
        boolean testStatus = userDetails.firstName("Salman");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenLastNameWhenPropershouldReturnTrue() {
        UserRegistration userDetails = new UserRegistration();
        boolean testStatus = userDetails.lastName("Pasha");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne() {
        UserRegistration userDetails = new UserRegistration();
        boolean testStatus = userDetails.passwordTest("Salman@889");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenEmailShouldReturnTrueWhenalltheConditionSatisfied() {
        UserRegistration userDetails = new UserRegistration();
        boolean testStatus = userDetails.gmailTest("mkspasha.xyz@gmail.com");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenMessageShouldReturnSadWhenTestIsPassed(){
        MoodAnalyser mood =  new MoodAnalyser();
        String testStatus = mood.messageContainHappyReturnHappyElseSad("This is Sad message");
        System.out.println(testStatus);
        Assert.assertEquals("Sad",testStatus);
    }
}
