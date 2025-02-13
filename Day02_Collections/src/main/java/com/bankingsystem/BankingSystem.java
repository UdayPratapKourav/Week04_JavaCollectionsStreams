package com.bankingsystem;



import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>(); // Stores accounts (AccountNumber -> Balance)
    private TreeMap<Double, List<Integer>> sortedAccounts = new TreeMap<>(); // Sorts accounts by balance
    private Queue<Integer> withdrawalQueue = new LinkedList<>(); // Queue for withdrawal requests

    // Create a new account with an initial balance
    public void createAccount(int accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account already exists.");
        }
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.computeIfAbsent(initialBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account does not exist.");
        }

        double oldBalance = accounts.get(accountNumber);
        sortedAccounts.get(oldBalance).remove((Integer) accountNumber);
        if (sortedAccounts.get(oldBalance).isEmpty()) {
            sortedAccounts.remove(oldBalance);
        }

        double newBalance = oldBalance + amount;
        accounts.put(accountNumber, newBalance);
        sortedAccounts.computeIfAbsent(newBalance, k -> new ArrayList<>()).add(accountNumber);
    }

    // Withdraw money from an account
    public void withdraw(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account does not exist.");
        }
        if (accounts.get(accountNumber) < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        withdrawalQueue.add(accountNumber);
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    // Get account balance
    public double getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, -1.0);
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, List<Integer>> entry : sortedAccounts.entrySet()) {
            for (Integer account : entry.getValue()) {
                System.out.println("Account: " + account + " - Balance: $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 7000);

        bank.deposit(101, 2000);
        bank.withdraw(102, 1000);
        bank.processWithdrawals();

        bank.displaySortedAccounts();
    }
}
