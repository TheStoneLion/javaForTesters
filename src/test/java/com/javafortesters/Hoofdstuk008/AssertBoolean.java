package com.javafortesters.Hoofdstuk008;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AssertBoolean {
    boolean waarheid=true;

    @Test
    public void IsWaar() {
        if (waarheid)
            assertTrue(waarheid);
    }

    @Test
    public void IsNietWaar() {
        if (!waarheid)
            assertFalse(!waarheid);
    }

    @Test
    public void IsWaarOfNietWaar() {
        if (waarheid)
            assertTrue(waarheid);
        else
            assertFalse(!waarheid);
    }

    @Test
    public void IsWaarOfNietWaar2() {
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
