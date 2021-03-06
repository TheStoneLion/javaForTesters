package com.javafortesters.Hoofdstuk007;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OperatorsAndAssignments {
    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9%2);
    }

    @Test
    public void assignmentOperatorsExplored(){
        String ab = "ab";
        assertEquals("ab", ab);

        int num = 10;
        assertEquals(10, num);

        num += 2;
        assertEquals("+= increments by", 12, num);

        num -= 4;
        assertEquals("-= decrements by", 8, num);

        num *= 2;
        assertEquals("*= multiplies by", 16, num);

        num /= 4;
        assertEquals("*= multiplies by", 4, num);

        num %=3;
        assertEquals("%= modulus of", 1, num);
    }
}
