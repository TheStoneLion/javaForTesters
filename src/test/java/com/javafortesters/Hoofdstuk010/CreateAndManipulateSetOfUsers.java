package com.javafortesters.Hoofdstuk010;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;


public class CreateAndManipulateSetOfUsers {
    @Test
    public void CreateSet() {
        Set collectionOfUsers01 = new HashSet<User>();

        assertEquals(0, collectionOfUsers01.size());
        assertTrue(collectionOfUsers01.isEmpty());

        User[] gebruikers01 = new User[3];
        gebruikers01[0] = new User("Marc", "Welkom01");
        gebruikers01[1] = new User("Marieke", "Welkom02");
        gebruikers01[2] = new User("Alexander", "Welkom03");

        collectionOfUsers01.add(gebruikers01[1]);

        assertEquals("1", 1, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());

        collectionOfUsers01.add(gebruikers01[1]);

        assertEquals("1", 1, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());

        collectionOfUsers01.add(gebruikers01[2]);

        assertEquals("1", 2, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());
    }
}
