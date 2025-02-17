package junit.testingstringutilitymethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Reversed: " + stringUtils.reverse(input));
        System.out.println("Is Palindrome: " + stringUtils.isPalindrome(input));
        System.out.println("Uppercase: " + stringUtils.toUpperCase(input));

        scanner.close();
    }
}
