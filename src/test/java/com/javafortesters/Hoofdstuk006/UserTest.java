package com.javafortesters.Hoofdstuk006;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstructANewUser_01() {
        User user = new User();

        user.setUsername("username");
        user.setPassword("password");

        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
        "password",
                user.getPassword());
    }

    @Test
    public void canConstructANewUser_02() {
        User user = new User("admin", "Welkom01");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "Welkom01",
                user.getPassword());
    }
}
