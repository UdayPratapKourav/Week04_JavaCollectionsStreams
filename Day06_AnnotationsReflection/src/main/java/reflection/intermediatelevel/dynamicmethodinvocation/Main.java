package reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MathOperations mathOps = new MathOperations();

            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.next();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get method using reflection
            Method method = MathOperations.class.getMethod(methodName, double.class, double.class);

            // Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
