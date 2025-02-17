package com.listinterface.frequencyofelementtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    public Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }


    @Test
    public void testMain(){
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2);
        expectedMap.put("banana", 1);
        expectedMap.put("orange", 1);

        Map<String, Integer> actualMap = countFrequency(list);

        assertEquals(expectedMap, actualMap);
    }
}
