package uppercaselowercase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile="src/main/java/uppercaselowercase/input.txt";
        String outputFile="src/main/java/uppercaselowercase/output.txt";

        try{
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile);
            String line ;
            while ((line=br.readLine())!=null){
                fw.write(line.toLowerCase());
                fw.flush();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
