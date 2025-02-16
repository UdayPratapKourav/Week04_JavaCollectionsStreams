package regex.advancedproblems.validatessn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Regex pattern for a valid SSN format: XXX-XX-XXXX
        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";

        // Scanner to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SSN: ");
        String input = sc.nextLine();

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Validate and print result
        if (matcher.matches()) {
            System.out.println("✅ \"" + input + "\" is a valid SSN.");
        } else {
            System.out.println("❌ \"" + input + "\" is an invalid SSN.");
        }

        sc.close();
    }
}
