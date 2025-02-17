package junit.testingpasswordstrengthvalidator;

import java.util.regex.Pattern;

public class PasswordValidator {

    // Method to validate the password based on the given criteria
    public static boolean validatePassword(String password) {
        // Check if password is at least 8 characters long, contains an uppercase letter and a digit
        return password.length() >= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find() &&
                Pattern.compile("[0-9]").matcher(password).find();
    }
}