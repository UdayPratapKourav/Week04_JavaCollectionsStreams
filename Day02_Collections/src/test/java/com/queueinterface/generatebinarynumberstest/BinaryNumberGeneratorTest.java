package com.queueinterface.generatebinarynumberstest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class BinaryNumberGeneratorTest {

    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String binary = queue.poll();
            result.add(binary);

            // Generate next binary numbers and add to queue
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }


    @Test
    public void testGenerateBinaryNumbers() {
        List<String> expectedOutput = Arrays.asList("1", "10", "11", "100", "101");
        assertEquals(expectedOutput, generateBinaryNumbers(5));
    }

    @Test
    public void testGenerateBinaryNumbersForOne() {
        List<String> expectedOutput = Arrays.asList("1");
        assertEquals(expectedOutput, generateBinaryNumbers(1));
    }

    @Test
    public void testGenerateBinaryNumbersForZero() {
        List<String> expectedOutput = Arrays.asList();
        assertEquals(expectedOutput, generateBinaryNumbers(0));
    }
}
