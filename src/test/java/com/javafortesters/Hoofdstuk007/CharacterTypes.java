package com.javafortesters.Hoofdstuk007;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CharacterTypes {
    @Test
    public void CharacterType(){
        char aChar = '\u0026';
        System.out.printf("ASCII character hex 26 is: %s%n", aChar);

        assertEquals(aChar, '&');
    }
}
