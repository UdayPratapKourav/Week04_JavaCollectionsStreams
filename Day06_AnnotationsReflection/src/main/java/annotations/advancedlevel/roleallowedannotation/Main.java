package annotations.advancedlevel.roleallowedannotation;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        // Setting role to USER (default)
        System.out.println("Trying as USER:");
        RoleValidator.invokeIfAuthorized(bankService, "approveLoan"); // Should print "Access Denied!"
        RoleValidator.invokeIfAuthorized(bankService, "checkBalance"); // Should print balance

        // Changing role to ADMIN
        System.out.println("\nTrying as ADMIN:");
        RoleValidator.setCurrentUserRole("ADMIN");
        RoleValidator.invokeIfAuthorized(bankService, "approveLoan"); // Should execute successfully
    }
}

