package annotations.advancedlevel.jsonfieldannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Annotation available at runtime
@Target(ElementType.FIELD) // Can be used on fields only
public @interface JsonField {
    String name(); // Custom JSON key name
}

