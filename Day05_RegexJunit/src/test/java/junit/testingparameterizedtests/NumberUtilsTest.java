package junit.testingparameterizedtests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class NumberUtilsTest {

    // Method that provides even numbers
    static Stream<Integer> evenNumbers() {
        return Stream.of(2, 4, 6, 8, 10);
    }

    // Method that provides odd numbers
    static Stream<Integer> oddNumbers() {
        return Stream.of(7, 9, 11, 13, 15);
    }

    // Test for even numbers
    @ParameterizedTest
    @MethodSource("evenNumbers")
    void testIsEvenWithEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), number + " should be even.");
    }

    // Test for odd numbers
    @ParameterizedTest
    @MethodSource("oddNumbers")
    void testIsEvenWithOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), number + " should be odd.");
    }
}
