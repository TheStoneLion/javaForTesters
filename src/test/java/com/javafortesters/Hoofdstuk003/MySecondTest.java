package com.javafortesters.Hoofdstuk003;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MySecondTest {
    @Test
    public void canAddTwoPlusTwoError(){
        int answer = 2+2;
        assertEquals("2 + 2 = 4", 5, answer);
    }
}
