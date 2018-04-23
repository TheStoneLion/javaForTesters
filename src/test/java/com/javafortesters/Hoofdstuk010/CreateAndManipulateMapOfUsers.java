package com.javafortesters.Hoofdstuk010;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class CreateAndManipulateMapOfUsers {
    @Test
    public void CreateMap() {
        Map<Integer, User> collectionOfUsers01 = new HashMap<>();

        assertEquals(0, collectionOfUsers01.size());
        assertTrue(collectionOfUsers01.isEmpty());

        User[] gebruikers01 = new User[3];
        gebruikers01[0] = new User("Marc", "Welkom01");
        gebruikers01[1] = new User("Marieke", "Welkom02");
        gebruikers01[2] = new User("Alexander", "Welkom03");

        collectionOfUsers01.put(1, gebruikers01[0]);

        assertEquals("1a", 1, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());
        assertEquals("1b", "Marc", collectionOfUsers01.get(1).getUsername());

        collectionOfUsers01.put(1, gebruikers01[0]);

        assertEquals("2", 1, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());

        collectionOfUsers01.put(2, gebruikers01[0]);
        collectionOfUsers01.put(3, gebruikers01[1]);
        collectionOfUsers01.put(4, gebruikers01[2]);

        assertEquals("3", 4, collectionOfUsers01.size());
        assertEquals("4a", "Marc", collectionOfUsers01.get(1).getUsername());
        assertEquals("4b", "Marc", collectionOfUsers01.get(2).getUsername());
        assertEquals("4c", "Marieke", collectionOfUsers01.get(3).getUsername());
        assertEquals("4d", "Alexander", collectionOfUsers01.get(4).getUsername());
        assertFalse(collectionOfUsers01.isEmpty());
    }
}
