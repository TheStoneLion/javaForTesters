package com.javafortesters.domainentities;

public class NumeriekeTekst {
    public static String getNumeriekTekst(int nummer) {
        switch (nummer) {
            case 1:
                return "Een";
            case 2:
                return "Twee";
            case 3:
                return "Drie";
            case 4:
                return "Vier";
            default:
                if (nummer < 1) {
                    return "Te klein";
                } else {
                    return "Te groot";
                }
        }
    }
}
