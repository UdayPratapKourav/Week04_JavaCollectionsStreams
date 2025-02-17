package junit.testingfilehandlingmethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileProcessorTest {

    private static final String TEST_FILENAME = "testFile.txt";

    // Test: Check if content is written and read correctly
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";

        // Write to file
        FileProcessor.writeToFile(TEST_FILENAME, content);

        // Read from file
        String result = FileProcessor.readFromFile(TEST_FILENAME);

        assertEquals(content, result, "Content should match.");
    }

    // Test: Check if the file exists after writing
    @Test
    void testFileExistenceAfterWrite() throws IOException {
        String content = "Test file existence!";

        // Write to file
        FileProcessor.writeToFile(TEST_FILENAME, content);

        // Check if the file exists
        assertTrue(Files.exists(Paths.get(TEST_FILENAME)), "File should exist after writing.");
    }

    // Test: Check for handling IOException when file does not exist
    @Test
    void testReadFromNonExistentFile() {
        String nonExistentFile = "nonExistentFile.txt";

        // Assert that an IOException is thrown when trying to read a non-existent file
        assertThrows(IOException.class, () -> FileProcessor.readFromFile(nonExistentFile), "IOException should be thrown.");
    }

    // Cleanup: Delete the test file after tests
    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILENAME));
    }
}