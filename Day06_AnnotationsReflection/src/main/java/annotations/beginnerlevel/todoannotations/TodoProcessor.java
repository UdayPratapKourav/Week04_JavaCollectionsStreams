package annotations.beginnerlevel.todoannotations;

import java.lang.reflect.Method;

public class TodoProcessor {

    public static void main(String[] args) {
        // Get the class object for ProjectTasks
        Class<?> clazz = ProjectTasks.class;  // Fixed incorrect reference

        // Iterate over all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method is annotated with @Todo
            if (method.isAnnotationPresent(Todo.class)) {
                // Get the annotation instance
                Todo annotation = method.getAnnotation(Todo.class);

                // Print task details
                System.out.println("Task: " + annotation.task());
                System.out.println("Assigned To: " + annotation.assignedTo());
                System.out.println("Priority: " + annotation.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("----------------------");
            }
        }
    }
}
