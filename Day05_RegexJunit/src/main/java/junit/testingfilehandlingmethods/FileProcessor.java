package junit.testingfilehandlingmethods;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

    // Method to write content to a file
    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
            writer.write(content);
        }
    }

    // Method to read content from a file
    public static String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }
}