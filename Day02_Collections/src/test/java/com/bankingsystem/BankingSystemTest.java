package com.bankingsystem;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankingSystemTest {

    @Test
    public void testCreateAccount() {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(101, 5000);
        assertEquals(5000, bank.getBalance(101));
    }

    @Test
    public void testDeposit() {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(102, 3000);
        bank.deposit(102, 2000);
        assertEquals(5000, bank.getBalance(102));
    }

    @Test
    public void testWithdraw() {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(103, 7000);
        bank.withdraw(103, 2000);
        assertEquals(7000, bank.getBalance(103)); // Since withdraws are queued, balance remains unchanged
    }

    @Test
    public void testGetBalance() {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(104, 6000);
        assertEquals(6000, bank.getBalance(104));
    }

    @Test
    public void testInvalidWithdraw() {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(105, 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(105, 2000);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
    }
}
