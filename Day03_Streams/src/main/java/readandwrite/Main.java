package readandwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile="src/main/java/readandwrite/input.txt";
        String outputFile="src/main/java/readandwrite/output.txt";

        try{
            FileInputStream fis= new FileInputStream(inputFile);
            FileOutputStream fos= new FileOutputStream(outputFile);
            int byteData;
            while ((byteData=fis.read())!=-1){
                fos.write(byteData);
            }
            System.out.println("File copied successfully .");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
