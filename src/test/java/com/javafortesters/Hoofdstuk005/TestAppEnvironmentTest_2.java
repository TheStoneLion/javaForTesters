package com.javafortesters.Hoofdstuk005;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest_2 {
    @Test
    public void canGetUrlStatically_2(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrlNull());

        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrlInt());
    }
}
