import org.junit.jupiter.api.Test; // Needed for @Test annotation

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSumWithNegativeNumber() {
        assertEquals(-1, calculator.sum(2, -3));
    }

    @Test
    public void testSumResultInZero() {
        assertEquals(0, calculator.sum(2, -2));
    }

    @Test
    public void testSubtract() {
        assertEquals(9, calculator.subtract(18, 9));
    }

    @Test
    public void testSubtractWithZero() {
        assertEquals(9, calculator.subtract(9, 0));
    }

    @Test
    public void testSubtractWithNegativeNumber() {
        assertEquals(18, calculator.subtract(9, -9));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(9, 0));
    }

    @Test
    public void testMultiplyWithNegativeNumber() {
        assertEquals(-9, calculator.multiply(3, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(9, 0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testIsEven() {
        assertTrue(calculator.isEven(2));
    }


    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(calculator.isEven(9));
    }

    @Test
    public void testIsEvenWithNegativeNumber() {
        assertTrue(calculator.isEven(-2));
    }
}
