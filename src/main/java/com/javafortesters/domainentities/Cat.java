package com.javafortesters.domainentities;

public class Cat {
    public static String getCatOrCats(int nrOfCats) {
        return ((nrOfCats > 1) ? "cats" : "cat");
    }
}
