package com.javafortesters.Hoofdstuk013;

import com.javafortesters.domainentities.InvalidPassword;
import com.javafortesters.domainentities.User2;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class CreateAnInvalidPasswordException {
    @Test
    public void TestThrowExexptionOnInvalidPasswordSetPassword() {
        User2 aUser = new User2();
        try {
            aUser.setPassword("wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void TestThrowExexptionOnInvalidPasswordConstructor() {
        try {
            User2 aUser = new User2("me","wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void TestThrowExexptionOnInvalidPasswordDefaultConstructor() {
        User2 aUser = new User2();
        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Test
    public void TestThrowExexptionOnInvalidPasswordConstructorMessage() {
        try {
            User2 aUser = new User2("me","wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword) {
            assertTrue("The exception was thrown", true);
            assertEquals("Password must be > 6 chars", invalidPassword.getMessage());
        }
    }

}
