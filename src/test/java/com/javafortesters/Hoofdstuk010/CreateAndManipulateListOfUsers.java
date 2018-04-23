package com.javafortesters.Hoofdstuk010;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CreateAndManipulateListOfUsers {
    @Test
    public void CreateList() {
        List collectionOfUsers01 = new ArrayList<User>();

        assertEquals(0, collectionOfUsers01.size());
        assertTrue(collectionOfUsers01.isEmpty());

        User[] gebruikers01 = new User[3];
        gebruikers01[0] = new User("Marc", "Welkom01");
        gebruikers01[1] = new User("Marieke", "Welkom02");
        gebruikers01[2] = new User("Alexander", "Welkom03");

        int i=0;
        for (; i < gebruikers01.length - 1; i++) {
            collectionOfUsers01.add(gebruikers01[i]);
        }

        assertEquals("1", 2, collectionOfUsers01.size());
        assertEquals("2",0, collectionOfUsers01.indexOf(gebruikers01[0]));
        assertEquals("3",1, collectionOfUsers01.indexOf(gebruikers01[1]));
        assertFalse(collectionOfUsers01.isEmpty());

        collectionOfUsers01.add(0, gebruikers01[i]);

        assertEquals("4",3, collectionOfUsers01.size());
        assertEquals("5",0, collectionOfUsers01.indexOf(gebruikers01[2]));
        assertEquals("6",1, collectionOfUsers01.indexOf(gebruikers01[0]));
        assertEquals("7",2, collectionOfUsers01.indexOf(gebruikers01[1]));
        assertFalse(collectionOfUsers01.isEmpty());

        collectionOfUsers01.remove(0);

        assertEquals("1", 2, collectionOfUsers01.size());
        assertEquals("2",0, collectionOfUsers01.indexOf(gebruikers01[0]));
        assertEquals("3",1, collectionOfUsers01.indexOf(gebruikers01[1]));
        assertFalse(collectionOfUsers01.isEmpty());
    }
}
