package junit.testingcalculatorclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator Program!");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        try {
            int result;
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation! Please choose +, -, *, or /.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
