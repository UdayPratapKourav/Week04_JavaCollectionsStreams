package com.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file ="src/main/java/com/checkedexception/file.txt";
        String notFile="filen.txt";
        //giving the wrong filename
        try(BufferedReader br = new BufferedReader(new FileReader(notFile))){
            String line ;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("File not found  ");
        }
    }
}
