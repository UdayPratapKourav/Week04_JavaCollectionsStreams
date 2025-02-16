package regex.advancedproblems.validatecreditcardnumber;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String regex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";

        System.out.println("Enter the card number:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();  // Trim extra spaces

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }

        sc.close();  // Close scanner to prevent resource leaks
    }
}
