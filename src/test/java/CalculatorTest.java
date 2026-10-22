import org.junit.jupiter.api.Test; // Needed for @Test annotation

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 5;
        int actual = calculator.sum(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        assertEquals(9, calculator.subtract(18, 9));
        assertEquals(-9, calculator.subtract(9, 18));
    }

    @Test
    public void testMultiply() {
        int expected = 4;
        int actual = calculator.multiply(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 3;
        int actual = calculator.divide(9, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(9, 0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testIsEven() {
        boolean expectedTrue = calculator.isEven(2);
        boolean expectedFalse = calculator.isEven(9);

        assertTrue(expectedTrue);
        assertFalse(expectedFalse);
    }
}
