package com.mapinterface.wordfrequency;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WordFrequencyCounterTest {

    private final String testFilename = "test_sample.txt";

    // Helper method to create a test file
    private void createTestFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(testFilename)) {
            writer.write(content);
        }
    }

    @Test
    public void testWordFrequencyCounter() throws IOException {
        createTestFile("Hello world, hello Java!");

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(testFilename);

        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("java"));
    }

    @Test
    public void testEmptyFile() throws IOException {
        createTestFile("");

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(testFilename);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testPunctuationAndCaseInsensitivity() throws IOException {
        createTestFile("Testing, testing! TESTING...");

        Map<String, Integer> result = WordFrequencyCounter.countWordFrequency(testFilename);

        assertEquals(3, result.get("testing"));
    }

    @Test
    public void testFileNotFound() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            WordFrequencyCounter.countWordFrequency("non_existent_file.txt");
        });

        assertTrue(exception.getMessage().contains("Error reading the file"));
    }
}
