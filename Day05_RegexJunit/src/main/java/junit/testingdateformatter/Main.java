package junit.testingdateformatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date in yyyy-MM-dd format: ");
        String inputDate = scanner.nextLine();

        try {
            String formattedDate = DateFormatter.formatDate(inputDate);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}