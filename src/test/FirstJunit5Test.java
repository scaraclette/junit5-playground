package test;
import main.OddEven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FirstJunit5Test {
    @Test
    void evenNumberReturnTrue() {
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(10));
    }

    @Test
    void oddNumberReturnFalse() {
        OddEven oddEven = new OddEven();
        assertFalse(oddEven.isNumberEven(11));
    }

}
