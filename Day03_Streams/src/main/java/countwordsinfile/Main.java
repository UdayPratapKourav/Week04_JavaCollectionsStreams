package countwordsinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split words by non-alphabetic characters (handling punctuation)
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return wordCountMap;
    }

    // Method to display top N most frequent words
    private static void displayTopWords(Map<String, Integer> wordCountMap, int topN) {
        // Sort by value (word frequency) in descending order
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Display top N words
        System.out.println("Top " + topN + " Most Frequent Words:");
        for (int i = 0; i < Math.min(topN, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + " -> " + sortedWords.get(i).getValue());
        }
    }

    public static void main(String[] args) {
        String filePath="src/main/java/countwordsinfile/file.txt";

        try {
            // Read file and count words
            Map<String, Integer> wordCountMap = countWords(filePath);

            // Display total words
            int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total Words: " + totalWords);

            // Display top 5 most frequent words
            displayTopWords(wordCountMap, 5);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
