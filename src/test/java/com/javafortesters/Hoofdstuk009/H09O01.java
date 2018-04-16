package com.javafortesters.Hoofdstuk009;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import com.javafortesters.domainentities.User;

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

    @Test
    public void CreateUsers () {
        User[] gebruikers = new User[100];
        for(int i=0; i < 100; i++) {
            //j = i + 1;
            gebruikers[i] = new User("user" + (i + 1), "password" + (i + 1));
        }

        assertEquals("user1", gebruikers[0].getUsername());
        assertEquals("password1", gebruikers[0].getPassword());
        assertEquals("user25", gebruikers[24].getUsername());
        assertEquals("password25", gebruikers[24].getPassword());
        assertEquals("user100", gebruikers[99].getUsername());
        assertEquals("password100", gebruikers[99].getPassword());
        assertEquals(100, gebruikers.length);
    }

    @Test
    public void SortWeekdays () {
        String[] workdaysUppercase = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday"};
        String[] workdaysMixedcase = {"monday", "Tuesday", "Wednesday", "thursday",
                "Friday"};
        Arrays.sort(workdaysUppercase);
        Arrays.sort(workdaysMixedcase);
        for(String day : workdaysUppercase){
            System.out.println(day);
        }
        for(String day : workdaysMixedcase){
            System.out.println(day);
        }
    }
}
