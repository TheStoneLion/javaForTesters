package com.javafortesters.Hoofdstuk007;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class TernaryBitwiseBitshift {
    //Ternary
    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue( 5>=4 ? true : false );
    }

    //Bitwise
    @Test
    public void bitwiseOperatorsExplored(){
        assertEquals(0b0001,
                0b1001 & 0b0101);

        assertEquals(0b1101,
                0b1001 | 0b0101);

        assertEquals(0b1100,
                0b1001 ^ 0b0101);

        int x = 0b0001;
        assertEquals("11111111111111111111111111111110",
                Integer.toBinaryString(~x));
    }

    @Test
    public void bitwiseAssignmentOperatorsExplored(){
        byte x = 0b0001;

        x &= 0b1011;
        assertEquals(0b0001, x);

        x |= 0b1001;
        assertEquals(0b1001, x);

        x ^= 0b1110;
        assertEquals(0b0111, x);
    }

    //Bit shift
    @Test
    public void bitwiseShiftOperatorsExplored(){
        int x = 56;

        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);

        x <<=3;
        assertEquals(56*8, x);

        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);

        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
    }
}
