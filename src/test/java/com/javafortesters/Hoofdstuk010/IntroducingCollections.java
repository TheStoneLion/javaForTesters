package com.javafortesters.Hoofdstuk010;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class IntroducingCollections {
    @Test
    public void Oefening001() {
        String[] someDays = {"Dinsdag","Donderdag",
                "Woensdag","Maandag",
                "Zaterdag","Zondag",
                "Vrijdag"};
        List<String> days = Arrays.asList(someDays);

        int i=0;
        while(i < days.size() ){
            System.out.printf("Dag %d is %s%n", (i + 1), days.get(i));
            i++;
        }

        System.out.println("");

        for(int j=0; j < days.size(); j++ ){
            System.out.printf("Dag %d is %s%n", (j + 1), days.get(j));
        }
    }
}
