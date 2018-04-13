package com.javafortesters.Hoofdstuk005;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest_1 {
    @Test
    public void canGetUrlStatically_1(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnv.getUrl());
    }
}
