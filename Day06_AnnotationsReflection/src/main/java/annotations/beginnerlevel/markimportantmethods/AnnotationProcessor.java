package annotations.beginnerlevel.markimportantmethods;

import java.lang.reflect.Method;

public class AnnotationProcessor {

    public static void main(String[] args) {
        // Get the class object for SampleClass
        Class<?> clazz = ImpMe.class;

        // Iterate over all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method is annotated with @ImportantMethod
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                // Get the annotation instance
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

                // Print method name and annotation details
                System.out.println("Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println();
            }
        }
    }
}
