package com.javafortesters.Hoofdstuk012;

import com.javafortesters.domainentities.ExtendedUser;
import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InheritanceAndCompsition {
    @Test
    public void emptyUserExampleTest(){
        ExtendedUser enu = new ExtendedUser();
        assertEquals("username", enu.getUsername());
        assertEquals("password", enu.getPassword());
        assertEquals("http://192.123.0.3:67", TestAppEnv.getUrl());
        assertEquals("http://192.123.0.3:67", ExtendedUser.GetUrlStatic());
        assertEquals("http://192.123.0.3:67", enu.GetUrl());
    }
}
