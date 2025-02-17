package junit.testingpasswordstrengthvalidator;

public class Main {
    public static void main(String[] args) {
        // Test cases to check the password validator

        String[] testPasswords = {
                "Passw0rd",        // Valid password
                "Pass1",           // Too short
                "password1",       // No uppercase letter
                "Password",        // No digit
                "password"         // No uppercase and no digit
        };

        // Test the passwords
        for (String password : testPasswords) {
            boolean isValid = PasswordValidator.validatePassword(password);
            System.out.println("Password: " + password + " | Valid: " + isValid);
        }
    }
}