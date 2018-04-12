import org.junit.Test;
import java.lang.Integer;
import static org.junit.Assert.assertEquals;

public class Chap004OefIntToHexTest {
    @Test
    public void Dec11IsHexb() {
        Integer decimaal = 11;
        String hexadecimaal = Integer.toHexString(decimaal);
        assertEquals("Decimaal 11 is hexadecimaal b", "b", hexadecimaal);
    }

    @Test
    public void Dec10IsHexa() {
        Integer decimaal = 10;
        String hexadecimaal = Integer.toHexString(decimaal);
        assertEquals("Decimaal 10 is hexadecimaal a", "a", hexadecimaal);
    }

    @Test
    public void Dec3IsHex3() {
        Integer decimaal = 3;
        String hexadecimaal = Integer.toHexString(decimaal);
        assertEquals("Decimaal 3 is hexadecimaal 3", "3", hexadecimaal);
    }

    @Test
    public void Dec21IsHex15() {
        Integer decimaal = 21;
        String hexadecimaal = Integer.toHexString(decimaal);
        assertEquals("Decimaal 21 is hexadecimaal 15", "15", hexadecimaal);
    }
}
