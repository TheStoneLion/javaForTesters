package com.javafortesters.Hoofdstuk010;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CreateAndManipulateCollectionOfUsers {
    @Test
    public void CreateCollectionOfUsers() {
        Collection collectionOfUsers = new <User>ArrayList();

        assertEquals(0, collectionOfUsers.size());
        assertTrue(collectionOfUsers.isEmpty());
    }

    @Test
    public void CreateUsersAndAddAndRemovetoCollection() {
        Collection collectionOfUsers01 = new <User>ArrayList();

        User[] gebruikers01 = new User[2];
        gebruikers01[0] = new User("Marc", "Welkom01");
        gebruikers01[1] = new User("Marieke", "Welkom01");

        collectionOfUsers01.add(gebruikers01[0]);
        collectionOfUsers01.add(gebruikers01[1]);

        assertEquals(2, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());

        Collection collectionOfUsers02 = new <User>ArrayList();

        User[] gebruikers02 = new User[2];
        gebruikers02[0] = new User("Mickey", "Welkom01");
        gebruikers02[1] = new User("Donald", "Welkom01");

        collectionOfUsers02.add(gebruikers02[0]);
        collectionOfUsers02.add(gebruikers02[1]);

        ((ArrayList) collectionOfUsers01).addAll(collectionOfUsers02);

        assertEquals(4, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());
        assertEquals(2, collectionOfUsers02.size());
        assertFalse(collectionOfUsers02.isEmpty());

        collectionOfUsers02.removeAll(collectionOfUsers01);

        assertEquals(4, collectionOfUsers01.size());
        assertFalse(collectionOfUsers01.isEmpty());
        assertEquals(0, collectionOfUsers02.size());
        assertTrue(collectionOfUsers02.isEmpty());

        collectionOfUsers01.clear();

        assertEquals(0, collectionOfUsers01.size());
        assertTrue(collectionOfUsers01.isEmpty());
        assertEquals(0, collectionOfUsers02.size());
        assertTrue(collectionOfUsers02.isEmpty());}
}
