package junit.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testDivideValidNumbers() {
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(-5, calculator.divide(-10, 2));
    }

    @Test
    void testDivideByZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
