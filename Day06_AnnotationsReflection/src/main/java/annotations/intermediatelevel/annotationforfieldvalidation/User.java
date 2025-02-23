package annotations.intermediatelevel.annotationforfieldvalidation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        validateFields();
        this.username = username;
    }

    private void validateFields() {
        // Use Reflection to validate fields
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);

                try {
                    // Get the field value
                    String value = (String) field.get(this);

                    // Get the maximum length from the annotation
                    int maxLength = field.getAnnotation(MaxLength.class).value();

                    // Validate the length
                    if (value != null && value.length() > maxLength) {
                        throw new IllegalArgumentException(
                                "Field '" + field.getName() + "' exceeds maximum length of " + maxLength + " characters."
                        );
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Failed to access field: " + field.getName(), e);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "User{username='" + username + "'}";
    }
}
