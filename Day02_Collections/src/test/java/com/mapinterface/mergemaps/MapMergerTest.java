package com.mapinterface.mergemaps;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MapMergerTest {

    @Test
    public void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put("A", 1);
        expectedOutput.put("B", 5);
        expectedOutput.put("C", 4);

        assertEquals(expectedOutput, MapMerger.mergeMaps(map1, map2));
    }

    @Test
    public void testMergeMapsWithEmptySecondMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("X", 10);

        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(map1, MapMerger.mergeMaps(map1, map2));
    }

    @Test
    public void testMergeMapsWithEmptyFirstMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Y", 20);

        assertEquals(map2, MapMerger.mergeMaps(map1, map2));
    }

    @Test
    public void testMergeMapsWithBothEmpty() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MapMerger.mergeMaps(map1, map2).isEmpty());
    }
}
