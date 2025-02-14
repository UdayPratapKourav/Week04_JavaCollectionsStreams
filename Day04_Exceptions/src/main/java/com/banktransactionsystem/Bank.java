package com.banktransactionsystem;

public class Bank {
    public static double balance=500;
    public  void withdraw(double amount)throws InsufficientBalanceException{
        if(amount<0){
            throw new  IllegalArgumentException("Invalid amount!");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance=balance-amount;
        System.out.println("Withdrawal successful, new balance: "+balance);

    }
}
