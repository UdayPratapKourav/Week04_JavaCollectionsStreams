package annotations.advancedlevel.roleallowedannotation;

class BankService {
    @RoleAllowed("ADMIN")
    public void approveLoan() {
        System.out.println("Loan approved successfully!");
    }

    public void checkBalance() {
        System.out.println("Your balance is $5000.");
    }
}

