package com.throwvsthrows;

import java.util.Scanner;

public class Main {
    public static double calculateInterest(double amount,double rate , int years)throws IllegalArgumentException{
        if(amount<0 || rate<0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        double interest=(amount*rate*years)/100;
        return interest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
        double amount=sc.nextDouble();
        System.out.println("Enter the rate :");
        double rate=sc.nextDouble();
        System.out.println("Enter the years :");
        int years= sc.nextInt();
        try{
            System.out.println("Interest is "+calculateInterest(amount,rate,years));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
