package com.banktransactionsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        try{
            System.out.println("Enter amount :");
            double amount=sc.nextDouble();
            bank.withdraw(amount);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException f){
            System.out.println(f.getMessage());
        }
        sc.close();

    }
}
