package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class ExtendedUser extends User {
    public String GetUrl() {
        return TestAppEnv.getUrl();
    }

    public static String GetUrlStatic() {
        return TestAppEnv.getUrl();
    }
}