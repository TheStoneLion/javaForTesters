package com.javafortesters.domainobject;

public class TestAppEnv {
    public static String getUrl() {
        return "http://192.123.0.3:67";
    }

    public static String getUrlNull() {
        return null;
    }

    public static int getUrlInt() {
        return 67;
    }
}
