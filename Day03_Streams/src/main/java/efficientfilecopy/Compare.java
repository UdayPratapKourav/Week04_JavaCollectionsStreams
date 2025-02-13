package efficientfilecopy;

import java.io.*;

public class Compare {
    public static long copyFileWithBufferedStreams(String source, String destination){
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (System.nanoTime() - startTime) / 1_000_000;
    }


    public static long copyFileWithUnbufferedStreams(String source, String destination){
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (System.nanoTime() - startTime) / 1_000_000;
    }

}
