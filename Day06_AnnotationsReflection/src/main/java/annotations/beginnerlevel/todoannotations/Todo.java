package annotations.beginnerlevel.todoannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task(); // Description of the task
    String assignedTo(); // Developer responsible
    String priority() default "MEDIUM"; // Optional parameter with a default value
}
