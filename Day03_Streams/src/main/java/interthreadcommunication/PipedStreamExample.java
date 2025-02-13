package interthreadcommunication;



import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes()); // Convert String to bytes and write
            System.out.println("Writer: Message sent.");
            pos.close(); // Close the stream after writing
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(pis));
            String receivedMessage = br.readLine(); // Read the message
            System.out.println("Reader: Message received - " + receivedMessage);
            pis.close(); // Close the stream after reading
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect streams

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start(); // Start writer thread
            reader.start(); // Start reader thread
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

