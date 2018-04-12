package com.javafortesters.chap004testswithotherclasses.examples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chap004Oef001 {
    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());
    }

    @Test
    public void integerExplorationString() {
        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());
    }
}
