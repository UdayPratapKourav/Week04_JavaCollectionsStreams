package com.customexception;


import java.util.Scanner;

public class Main {
    public static void validateAge(int age)throws InvalidAgeException{
            if(age>=18){
                System.out.println("Access granted!");
            }else{
                throw new InvalidAgeException("Age must be 18 or above");
            }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        try{
            validateAge(age);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
