package com.mapinterface.findthekey;



import java.util.*;

public class MaxKeyFinder {

    public static String findMaxKey(Map<String, Integer> inputMap) {
        if (inputMap == null || inputMap.isEmpty()) {
            throw new IllegalArgumentException("Map is empty or null");
        }

        return Collections.max(inputMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        System.out.println("Key with the highest value: " + findMaxKey(inputMap));
    }
}
