package com.mapinterface.wordfrequency;



import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(String filename) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading the file: " + e.getMessage());
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String filename = "src/main/java/com/mapinterface/wordfrequency/file.txt"; // Ensure this file exists in your project directory
        Map<String, Integer> wordCount = countWordFrequency(filename);

        System.out.println("Word Frequency Count: " + wordCount);
    }
}
