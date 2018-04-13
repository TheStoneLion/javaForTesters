package com.javafortesters.Hoofdstuk008;

import org.junit.Test;
import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

import com.javafortesters.domainentities.Cat;

public class DisplayCatOrCats {
    @Test
    public void CatOrCatsTest() {
        int aantalKatten = 1;
        TestAantalKatten("kat", aantalKatten);

        aantalKatten = 2;
        TestAantalKatten("katten", aantalKatten);

        aantalKatten = 101;
        TestAantalKatten("katten", aantalKatten);
    }

    private void SchrijfAantalKatten(int aantalKatten) {
        out.printf("Wij hebben %d %s%n", aantalKatten, Cat.getCatOrCats(aantalKatten));
    }

    private void TestAantalKatten(String verwachtResultaat, int aantalKatten) {
        SchrijfAantalKatten(aantalKatten);
        assertEquals(aantalKatten + " katten", verwachtResultaat, Cat.getCatOrCats(aantalKatten));
    }
}
