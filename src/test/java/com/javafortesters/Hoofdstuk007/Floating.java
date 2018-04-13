package com.javafortesters.Hoofdstuk007;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Floating {
    @Test
    public void FloatingPointType(){
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println(
                "* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);

        System.out.println(
                "* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);

        singlePrecision32bit = 10.0F; // suffix F to get a float
        assertEquals(10F, singlePrecision32bit, 0);

        doublePrecision64bit = 20.0; // default to double
        assertEquals(20D, doublePrecision64bit, 0);
    }
}
