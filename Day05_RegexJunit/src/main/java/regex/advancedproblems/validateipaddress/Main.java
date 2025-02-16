package regex.advancedproblems.validateipaddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the IP address:");
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        sc.close();  // Close scanner to prevent resource leak
    }
}
