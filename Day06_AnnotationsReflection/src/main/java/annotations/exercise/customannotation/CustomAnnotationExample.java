package annotations.exercise.customannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Urav")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}

public class CustomAnnotationExample {
    public static void main(String[] args) throws Exception {
        Class<TaskManager> clazz = TaskManager.class;
        Method method = clazz.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }

        TaskManager manager = new TaskManager();
        manager.completeTask();
    }
}
