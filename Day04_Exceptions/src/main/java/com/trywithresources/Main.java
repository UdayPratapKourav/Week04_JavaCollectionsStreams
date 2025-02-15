package com.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "src/main/java/com/trywithresources/info.txt.t";

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line=br.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error reading file ");
        }
    }
}
