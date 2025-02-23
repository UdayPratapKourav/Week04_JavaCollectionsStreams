package annotations.beginnerlevel.markimportantmethods;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Make the annotation available at runtime
public @interface ImportantMethod {
    String level() default "HIGH"; // Optional parameter with a default value
}
