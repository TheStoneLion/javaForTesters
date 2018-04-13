package com.javafortesters.Hoofdstuk008;

import com.javafortesters.domainentities.Country;
import com.javafortesters.domainentities.NumeriekeTekst;
import org.junit.Assert;
import org.junit.Test;

public class TestCountry {
    @Test
    public void CountryNameTest() {
        Assert.assertEquals(
                "UK is Verenigd Koninkrijk",
                "Verenigd Koninkrijk",
                Country.getCountryName("UK"));

        Assert.assertEquals(
                "US is Verenigde Staten",
                "Verenigde Staten",
                Country.getCountryName("US"));

        Assert.assertEquals(
                "USA is Verenigde Staten",
                "Verenigde Staten",
                Country.getCountryName("USA"));

        Assert.assertEquals(
                "SE is Zweden",
                "Zweden",
                Country.getCountryName("SE"));
    }

    @Test
    public void SwitchTrueTest() {
        Assert.assertEquals(
                "1 is Een",
                "Een",
                NumeriekeTekst.getNumeriekTekst(1));

        Assert.assertEquals(
                "2 is Twee",
                "Twee",
                NumeriekeTekst.getNumeriekTekst(2));

        Assert.assertEquals(
                "3 is Drie",
                "Drie",
                NumeriekeTekst.getNumeriekTekst(3));

        Assert.assertEquals(
                "4 is Vier",
                "Vier",
                NumeriekeTekst.getNumeriekTekst(4));

        Assert.assertEquals(
                "0 is Te klein",
                "Te klein",
                NumeriekeTekst.getNumeriekTekst(0));

        Assert.assertEquals(
                "Integer.MIN_VALUE is Te klein",
                "Te klein",
                NumeriekeTekst.getNumeriekTekst(Integer.MIN_VALUE));

        Assert.assertEquals(
                "5 is Te groot",
                "Te groot",
                NumeriekeTekst.getNumeriekTekst(5));

        Assert.assertEquals(
                "Integer.MAX_VALUE is Te groot",
                "Te groot",
                NumeriekeTekst.getNumeriekTekst(Integer.MAX_VALUE));
    }
}