package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15.0, calc.add(10.0, 5.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.subtract(10.0, 5.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(50.0, calc.multiply(10.0, 5.0), 0.001);
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2.0, calc.divide(10.0, 5.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator calc = new Calculator();
        calc.divide(10.0, 0.0);
    }
}
