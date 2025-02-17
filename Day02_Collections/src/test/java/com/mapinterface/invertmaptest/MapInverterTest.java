package com.mapinterface.invertmaptest;



import com.mapinterface.invertmap.MapInverter;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapInverterTest {

    @Test
    public void testInvertMap() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(1, Arrays.asList("A", "C"));
        expectedOutput.put(2, Collections.singletonList("B"));

        assertEquals(expectedOutput, MapInverter.invertMap(input));
    }

    @Test
    public void testInvertEmptyMap() {
        Map<String, Integer> input = new HashMap<>();
        Map<Integer, List<String>> expectedOutput = new HashMap<>();

        assertEquals(expectedOutput, MapInverter.invertMap(input));
    }

    @Test
    public void testInvertMapWithUniqueValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("X", 10);
        input.put("Y", 20);
        input.put("Z", 30);

        Map<Integer, List<String>> expectedOutput = new HashMap<>();
        expectedOutput.put(10, Collections.singletonList("X"));
        expectedOutput.put(20, Collections.singletonList("Y"));
        expectedOutput.put(30, Collections.singletonList("Z"));

        assertEquals(expectedOutput, MapInverter.invertMap(input));
    }
}
