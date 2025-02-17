package junit.testingpasswordstrengthvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    // Test: Valid password
    @Test
    void testValidPassword() {
        String validPassword = "Passw0rd";
        assertTrue(PasswordValidator.validatePassword(validPassword), "Password should be valid.");
    }

    // Test: Password with less than 8 characters
    @Test
    void testPasswordTooShort() {
        String shortPassword = "Pass1";
        assertFalse(PasswordValidator.validatePassword(shortPassword), "Password should be invalid because it's too short.");
    }

    // Test: Password without an uppercase letter
    @Test
    void testPasswordNoUppercase() {
        String passwordNoUppercase = "password1";
        assertFalse(PasswordValidator.validatePassword(passwordNoUppercase), "Password should be invalid because it lacks an uppercase letter.");
    }

    // Test: Password without a digit
    @Test
    void testPasswordNoDigit() {
        String passwordNoDigit = "Password";
        assertFalse(PasswordValidator.validatePassword(passwordNoDigit), "Password should be invalid because it lacks a digit.");
    }

    // Test: Password without both uppercase and digit
    @Test
    void testPasswordNoUppercaseNoDigit() {
        String passwordNoUppercaseNoDigit = "password";
        assertFalse(PasswordValidator.validatePassword(passwordNoUppercaseNoDigit), "Password should be invalid because it lacks both an uppercase letter and a digit.");
    }
}