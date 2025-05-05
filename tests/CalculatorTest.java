import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(6, Calculator.add(3, 3));
    }

    @Test
    public void testSubstract() {
        assertEquals(6, Calculator.substract(9, 3));
    }
}