package reflection.intermediatelevel.retrieveannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Applying Annotation
@Author(name = "sourav")
class SampleClass {
    // Some methods or fields
}

public class AnnotationRetriever {
    public static void main(String[] args) {
        // Retrieve annotation from SampleClass
        Class<SampleClass> obj = SampleClass.class;

        if (obj.isAnnotationPresent(Author.class)) {
            Author author = obj.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        } else {
            System.out.println("No @Author annotation present.");
        }
    }
}
