package readlargefile;

import java.io.*;

public class Main {
    public static void writeInFile(String filePath){
        String str = "I am learning java programing language\n";
        try{
            FileWriter fw = new FileWriter(filePath);
            for(int i=0;i<100;i++){
                fw.write(str);

                fw.flush();
            }
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath="src/main/java/readlargefile/file.txt";
//        writeInFile(filePath);

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String s;
            int lineNumber =0;
            while ((s=br.readLine())!=null){
                lineNumber++;
                if(s.toLowerCase().contains("error")){
                    System.out.println("Line " + lineNumber + ": " + s);
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
