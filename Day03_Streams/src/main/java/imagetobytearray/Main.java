package imagetobytearray;

import java.io.*;

public class Main {

    // Method to convert an image file to a byte array
    private static byte[] imageToByteArray(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Method to convert a byte array back into an image file
    private static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }


    public static void main(String[] args) {
        String inputImagePath ="src/main/java/imagetobytearray/Screenshot 2025-01-22 163836.png";
        String outputImagePath ="src/main/java/imagetobytearray/Screenshot 2025-01-23 150949.png";

        try {
            // Convert image to byte array
            byte[] imageBytes = imageToByteArray(inputImagePath);

            // Convert byte array back to image
            byteArrayToImage(imageBytes, outputImagePath);

            // Verify the size of both images
            File originalFile = new File(inputImagePath);
            File copiedFile = new File(outputImagePath);

            if (originalFile.length() == copiedFile.length()) {
                System.out.println("Success! The copied image is identical to the original.");
            } else {
                System.out.println("Warning! The copied image size differs from the original.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    }

