package com.mapinterface.findthekey;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MaxKeyFinderTest {

    @Test
    public void testFindMaxKey() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);

        assertEquals("B", MaxKeyFinder.findMaxKey(input));
    }

    @Test
    public void testFindMaxKeyWithSingleEntry() {
        Map<String, Integer> input = new HashMap<>();
        input.put("X", 50);

        assertEquals("X", MaxKeyFinder.findMaxKey(input));
    }

    @Test
    public void testFindMaxKeyWithNegativeValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("D", -5);
        input.put("E", -10);
        input.put("F", -1);

        assertEquals("F", MaxKeyFinder.findMaxKey(input));
    }

    @Test
    public void testFindMaxKeyWithEmptyMap() {
        Map<String, Integer> input = new HashMap<>();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MaxKeyFinder.findMaxKey(input);
        });

        assertTrue(exception.getMessage().contains("Map is empty or null"));
    }
}
