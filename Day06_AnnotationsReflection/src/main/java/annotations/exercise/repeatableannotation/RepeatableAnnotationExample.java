package annotations.exercise.repeatableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;

// Define a container annotation
@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

// Define a repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

class SoftwareModule {
    @BugReport(description = "Null pointer exception occurs under certain conditions.")
    @BugReport(description = "Memory leak detected when processing large files.")
    public void buggyMethod() {
        System.out.println("Executing buggy method...");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Class<SoftwareModule> clazz = SoftwareModule.class;
        Method method = clazz.getMethod("buggyMethod");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport report : bugReports.value()) {
                System.out.println("Bug Report: " + report.description());
            }
        }

        SoftwareModule module = new SoftwareModule();
        module.buggyMethod();
    }
}
