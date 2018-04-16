package com.javafortesters.Hoofdstuk009;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class H09O01 {

    @Test
    public void ProcessUsers (){
        User[] gebruikers = new User[3];
        gebruikers[0] = new User("Marc", "Welkom01");
        gebruikers[1] = new User("Marieke", "Welkom01");
        gebruikers[2] = new User("Alexander", "Welkom01");
        String gebruikersNamen = "";

        for (User gebruiker : gebruikers) {
            String gebruikersNaam = gebruiker.getUsername();
            gebruikersNamen = gebruikersNamen + "|" + gebruikersNaam;
            System.out.println(gebruikersNaam);
        }

        assertEquals("|Marc|Marieke|Alexander", gebruikersNamen);
    }
}
