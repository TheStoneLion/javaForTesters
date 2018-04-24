package com.javafortesters.Hoofdstuk014;

import org.junit.Before;
import org.junit.Test;

import java.time.ZonedDateTime;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class UseAllAsserts {
    @Before
    public void runOncePerClassBeforeEachTest(){
        System.out.println("@Before test methode - tijd " + ZonedDateTime.now());
    }

    @Test
    public void TestUseAllAsserts01() {
        int testTeller = 1;
        assertEquals("AssertEquals", 1, testTeller);
    }

    @Test
    public void TestUseAllAsserts02() {
        int testTeller = 2;
        assertFalse(testTeller == 1);
    }

    @Test
    public void TestUseAllAsserts03() {
        int testTeller = 3;
        assertTrue(testTeller == 3);
    }

    @Test
    public void TestUseAllAsserts04() {
        String[] testString01 = {"1", "2"};
        String[] testString02 = {"1", "2"};
        assertArrayEquals(testString01, testString02);
    }

    @Test
    public void TestUseAllAsserts05() {
        String testString = "Hallo";
        assertNotNull(testString);
    }

    @Test
    public void TestUseAllAsserts06() {
        String testString01 = "Hallo";
        String testString02 = "Hallo";
        assertNotSame(testString01, testString02);
    }

    @Test
    public void TestUseAllAsserts07() {
        String testString = null;
        assertNull(testString);
    }

    @Test
    public void TestUseAllAsserts08() {
        String testString01 = "Hallo";
        String testString02 = testString01;
        assertSame(testString01, testString02);
    }
}
