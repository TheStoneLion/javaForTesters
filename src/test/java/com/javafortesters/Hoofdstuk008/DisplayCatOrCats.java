package com.javafortesters.Hoofdstuk008;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.javafortesters.domainentities.Cat;

public class DisplayCatOrCats {
    @Test
    public void TestCatOrCats() {
        int nrOfCats = 1;
        System.out.println(
                "We have " +
                nrOfCats +
                " " +
                Cat.getCatOrCats(nrOfCats));
        assertEquals("1 == cat", "cat", Cat.getCatOrCats(nrOfCats));

        nrOfCats = 2;
        System.out.println(
                "We have " +
                        nrOfCats +
                        " " +
                        Cat.getCatOrCats(nrOfCats));
        assertEquals("2 == cats", "cats", Cat.getCatOrCats(nrOfCats));

        nrOfCats = 101;
        System.out.println(
                "We have " +
                        nrOfCats +
                        " " +
                        Cat.getCatOrCats(nrOfCats));
        assertEquals("101 == cats", "cats", Cat.getCatOrCats(nrOfCats));
    }
}
