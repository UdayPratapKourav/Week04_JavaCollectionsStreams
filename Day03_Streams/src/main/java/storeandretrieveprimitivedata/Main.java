package storeandretrieveprimitivedata;

import java.io.*;

public class Main {

    public static void writeStudentData() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            // Writing multiple student records
            dos.writeInt(101); // Roll number
            dos.writeUTF("Alice Johnson"); // Name
            dos.writeDouble(3.8); // GPA

            dos.writeInt(102);
            dos.writeUTF("Bob Smith");
            dos.writeDouble(3.5);

            dos.writeInt(103);
            dos.writeUTF("Charlie Brown");
            dos.writeDouble(3.9);

            System.out.println("Student data successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("\nReading student data from file:");
            while (dis.available() > 0) { // Check if there is still data to read
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static final String filePath="src/main/java/storeandretrieveprimitivedata/file.txt";
    public static void main(String[] args) {

        // Writing student data to the binary file
        writeStudentData();

        // Reading student data from the binary file
        readStudentData();
    }
}
