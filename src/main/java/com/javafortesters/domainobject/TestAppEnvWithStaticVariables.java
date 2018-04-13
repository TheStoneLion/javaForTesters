package com.javafortesters.domainobject;

public class TestAppEnvWithStaticVariables {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrlWithStaticVariables() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
