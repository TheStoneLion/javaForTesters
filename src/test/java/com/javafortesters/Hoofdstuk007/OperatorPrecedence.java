package com.javafortesters.Hoofdstuk007;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorPrecedence {
    @Test
    public void operatorPrecedence(){
        assertEquals(8, 4+2*6/3 );
        assertEquals(12, (((4+2)*6)/3) );
    }
}
