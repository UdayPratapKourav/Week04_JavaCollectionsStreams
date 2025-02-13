package readuserinputfromconsole;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath= "src/main/java/readuserinputfromconsole/file.txt";





        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath)) {

            System.out.println("Enter your Name:");
            String name = br.readLine();
            fw.write("Name: " + name + System.lineSeparator());

            System.out.println("Enter your Age:");
            String age = br.readLine();
            fw.write("Age: " + age + System.lineSeparator());

            System.out.println("Enter your favorite programming language:");
            String language = br.readLine();
            fw.write("Favorite Programming Language: " + language + System.lineSeparator());

            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
