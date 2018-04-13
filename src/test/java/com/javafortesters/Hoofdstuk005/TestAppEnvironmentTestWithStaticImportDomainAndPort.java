package com.javafortesters.Hoofdstuk005;

import static com.javafortesters.domainobject.TestAppEnvWithStaticVariables.DOMAIN;
import static com.javafortesters.domainobject.TestAppEnvWithStaticVariables.PORT;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTestWithStaticImportDomainAndPort {
    @Test
    public void canGetUrlWithStaticVariables_1(){
        assertEquals("Domain",
                "192.123.0.3",
                DOMAIN);

        assertEquals("Port",
                "67",
                PORT);
    }
}
