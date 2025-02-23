package annotations.advancedlevel.cacheresultannotation;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the original class
        MathOperations mathOps = new MathOperations();

        // Create a proxy with caching
        IMathOperations proxyInstance = (IMathOperations) Proxy.newProxyInstance(
                mathOps.getClass().getClassLoader(),
                mathOps.getClass().getInterfaces(),
                new CacheHandler(mathOps)
        );

        // Test Caching
        System.out.println("Factorial of 5: " + proxyInstance.factorial(5));
        System.out.println("Factorial of 5: " + proxyInstance.factorial(5));
        System.out.println("Factorial of 6: " + proxyInstance.factorial(6));
    }
}