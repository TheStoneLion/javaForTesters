package com.javafortesters.domainentities;

public class Country {
    public static String getCountryName(String countryCode) {
        switch (countryCode) {
            case "UK":
                return "Verenigd Koninkrijk";
            case "US":
            case "USA":
                return "Verenigde Staten";
            case "FR":
                return "Frankrijk";
            case "SE":
                return "Zweden";
            default:
                return "Rest Van De Werld";
        }
    }
}
