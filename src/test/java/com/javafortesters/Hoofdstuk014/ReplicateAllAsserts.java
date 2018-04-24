package com.javafortesters.Hoofdstuk014;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

public class ReplicateAllAsserts {
    @Test
    public void AssertThatReplacesAssertEquals() {
        int testTeller = 1;
        assertEquals("AssertEquals", 1, testTeller);
        assertThat("", 1, is(testTeller));
    }

    @Test
    public void AssertThatReplacesAssertFalse() {
        int testTeller = 2;
        assertFalse(testTeller == 1);
        assertThat("", false, is(testTeller==1));
    }

    @Test
    public void AssertThatReplacesAssertTrue() {
        int testTeller = 3;
        assertTrue(testTeller == 3);
        assertThat("", true, is(testTeller==3));
    }

    @Test
    public void AssertThatReplacesAssertArrayEquals() {
        String[] testString01 = {"1", "2"};
        String[] testString02 = {"1", "2"};
        assertArrayEquals(testString01, testString02);
        assertThat("", testString01, equalTo(testString02));
    }

    @Test
    public void AssertThatReplacesAssertNotNull() {
        String testString = "Hallo";
        assertNotNull(testString);
        assertThat("", testString, is(notNullValue()));
    }

    @Test
    public void AssertThatReplacesAssertNull() {
        String testString = null;
        assertNull(testString);
        assertThat("", testString, is(nullValue()));
    }
}
