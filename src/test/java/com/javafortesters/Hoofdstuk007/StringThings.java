package com.javafortesters.Hoofdstuk007;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StringThings {
    //concatenation
    @Test
    public void stringsConcatenated(){
        assertEquals("123456", "12" + "34" + "56");
    }

    //methods
    @Test
    public void someStringMethods(){
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));

        // string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
