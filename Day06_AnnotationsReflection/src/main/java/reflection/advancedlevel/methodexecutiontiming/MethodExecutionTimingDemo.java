package reflection.advancedlevel.methodexecutiontiming;

import java.lang.reflect.Method;

class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Class<?> clazz = obj.getClass();

            // Get the method with matching name and parameter types
            Method method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);

            long startTime = System.nanoTime();
            method.invoke(obj, args);
            long endTime = System.nanoTime();

            System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) + " ns");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class SampleClass {
    public void sampleMethod() {
        for (int i = 0; i < 1000000; i++); // Simulated workload
    }
}

public class MethodExecutionTimingDemo {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        MethodTimer.measureExecutionTime(sample, "sampleMethod");
    }
}
