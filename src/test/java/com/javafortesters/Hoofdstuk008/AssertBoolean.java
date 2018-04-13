package com.javafortesters.Hoofdstuk008;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AssertBoolean {
    boolean waarheid=true;

    @Test
    public void IsWaarTest() {
        if (waarheid)
            assertTrue(waarheid);
    }

    @Test
    public void IsNietWaarTest() {
        if (!waarheid)
            assertFalse(!waarheid);
    }

    @Test
    public void IsWaarOfNietWaarTest() {
        if (waarheid)
            assertTrue(waarheid);
        else
            assertFalse(!waarheid);
    }

    @Test
    public void IsWaarOfNietWaar2Test() {
        waarheid=false;

        if (waarheid) {
            assertTrue(waarheid);
            assertFalse(!waarheid);
        }
        else {
            assertFalse(waarheid);
            assertTrue(!waarheid);
        }
    }
}
