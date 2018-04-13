package com.javafortesters.Hoofdstuk007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncrementAndDecrement {
    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }
}
