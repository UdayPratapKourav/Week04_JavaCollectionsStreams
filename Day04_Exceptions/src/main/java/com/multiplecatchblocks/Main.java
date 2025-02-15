package com.multiplecatchblocks;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= {10,20,30,40,50,60,70};
        try{
            System.out.println("Enter the index :");
            int a = sc.nextInt();
            System.out.println(arr[a]);

        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Invalid index!");
        }catch (NullPointerException n){
            System.out.println("Array is not initialized!");
        }
        sc.close();
    }
}
