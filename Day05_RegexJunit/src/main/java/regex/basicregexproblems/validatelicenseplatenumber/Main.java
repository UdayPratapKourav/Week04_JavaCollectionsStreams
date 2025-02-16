package regex.basicregexproblems.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex="^[A-Z]{2}+[0-9]{4}$";
        System.out.println("Enter the plate number :");
        String input =sc.nextLine();
        Pattern pattern=Pattern.compile(regex);
        boolean ans=pattern.matcher(input).matches();
        if(ans==true){
            System.out.println(input+" is valid");
        }else{
            System.out.println(input +" is invalid");
        }
    }
}
