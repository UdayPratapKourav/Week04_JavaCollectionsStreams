package com.nestedtrycatchblock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        try{
            System.out.println("Enter the index");
            int index=sc.nextInt();
            try{
                System.out.println("Enter the Divisor :");
                int a=sc.nextInt();
                System.out.println("Division is : "+arr[index]/a);

            }catch (ArithmeticException e){
                System.out.println("Cannot divide by zero!");
            }




        }catch (ArrayIndexOutOfBoundsException n){
            System.out.println("Invalid array index!");
        }
    }
}
