import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chap004OefConfirmMaxMinValueIntegerTest {
    @Test
    public void MaxValueInteger() {
        Integer maxInteger = Integer.MAX_VALUE;
        Integer expectedMaxInteger = 2147483647;
        assertEquals("MAX Integer is 2147483647", expectedMaxInteger, maxInteger);
    }

    @Test
    public void MinxValueInteger() {
        Integer minInteger = Integer.MIN_VALUE;
        Integer expectedMinInteger = -2147483648;
        assertEquals("MIN Integer is -2147483648", expectedMinInteger, minInteger);
    }
}
