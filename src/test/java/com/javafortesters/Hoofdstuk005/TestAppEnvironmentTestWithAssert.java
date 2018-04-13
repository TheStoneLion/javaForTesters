package com.javafortesters.Hoofdstuk005;

import com.javafortesters.domainobject.TestAppEnvWithStaticVariables;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTestWithAssert {
    @Test
    public void canGetUrlWithStaticVariables_1(){
        Assert.assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                TestAppEnvWithStaticVariables.getUrlWithStaticVariables());
    }
}
