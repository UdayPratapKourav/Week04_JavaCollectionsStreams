package junit.testingbankingtransactions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);  // Initialize account with $1000
    }

    // Test: Deposit money into the account
    @Test
    void testDeposit() {
        account.deposit(500);  // Deposit $500
        assertEquals(1500, account.getBalance(), "Balance should be updated to $1500");
    }

    // Test: Withdraw money from the account
    @Test
    void testWithdraw() {
        boolean result = account.withdraw(300);  // Withdraw $300
        assertTrue(result, "Withdrawal should be successful.");
        assertEquals(700, account.getBalance(), "Balance should be updated to $700.");
    }

    // Test: Withdraw more money than the current balance
    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(1200);  // Attempt to withdraw $1200
        assertFalse(result, "Withdrawal should fail due to insufficient funds.");
        assertEquals(1000, account.getBalance(), "Balance should remain $1000.");
    }

    // Test: Check if the balance is 0 after withdrawing all funds
    @Test
    void testWithdrawAllFunds() {
        account.withdraw(1000);  // Withdraw all the balance
        assertEquals(0, account.getBalance(), "Balance should be $0 after withdrawing all funds.");
    }
}