package junit.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    // Test valid user registration
    @Test
    void testValidRegistration() {
        assertEquals("User registered successfully: JohnDoe",
                UserRegistration.registerUser("JohnDoe", "johndoe@example.com", "StrongPass1"));
    }

    // Test empty username
    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "user@example.com", "password123");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    // Test invalid email format
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("User123", "invalid-email", "password123");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    // Test short password
    @Test
    void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("User123", "user@example.com", "short");
        });
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }
}