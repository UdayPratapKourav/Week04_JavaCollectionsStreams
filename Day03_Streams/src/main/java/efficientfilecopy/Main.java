package efficientfilecopy;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/main/java/efficientfilecopy/largefile.txt";  // Change this to the actual source file
        String destinationBuffered = "src/main/java/efficientfilecopy/buffered_copy.txt";
        String destinationUnbuffered = "src/main/java/efficientfilecopy/unbuffered_copy.txt";
        String str = "The apple fell from the tree as the breeze carried the scent of chocolate through the forest. A butterfly fluttered near a river, reflecting the golden sunshine of the afternoon. In the distance, a mountain stood tall, its peak hidden behind clouds. The sound of an orchestra played softly, blending with the laughter of children flying a kite. A balloon floated upward, disappearing into the vast sky. Somewhere, a puzzle piece fit perfectly, solving a long-forgotten mystery. The ocean roared against the cliffs as a sailboat ventured toward the horizon. Stars sparkled above, a reminder of the infinite universe. In that moment, the world felt full of hope, adventure, and endless possibilities.";

        try {
            FileWriter fw = new FileWriter(sourceFile);
            for (int i = 0; i < 15000; i++) {
                fw.write(str);
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        long bufferedTime = Compare.copyFileWithBufferedStreams(sourceFile, destinationBuffered);
        long unbufferedTime = Compare.copyFileWithUnbufferedStreams(sourceFile, destinationUnbuffered);

        System.out.println("Buffered Streams Copy Time: " + bufferedTime + " ms");
        System.out.println("Unbuffered Streams Copy Time: " + unbufferedTime + " ms");

    }
}
