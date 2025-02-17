package junit.testingbankingtransactions;



public class Main {
    public static void main(String[] args) {
        // Create a BankAccount instance with an initial balance of $1000
        BankAccount account = new BankAccount(1000);

        // Display initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money into the account
        account.deposit(500);
        System.out.println("Balance after depositing $500: $" + account.getBalance());

        // Withdraw money from the account
        boolean result = account.withdraw(300);
        System.out.println("Withdrawal of $300 successful: " + result);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Attempt to withdraw more money than the current balance
        result = account.withdraw(1200);
        System.out.println("Withdrawal of $1200 successful: " + result);
        System.out.println("Balance after failed withdrawal: $" + account.getBalance());

        // Withdraw all funds from the account
        account.withdraw(1000);
        System.out.println("Balance after withdrawing all funds: $" + account.getBalance());
    }
}