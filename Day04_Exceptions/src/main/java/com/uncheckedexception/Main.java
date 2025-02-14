package com.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();
            System.out.println("Output" +a/b);
        }catch (ArithmeticException e){
            System.out.println("Enter only positive number ");
        }catch (InputMismatchException f){
            System.out.println("Enter only Integer value   ");
        }
    }
}
