package regex.basicregexproblems.validateusername;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the userName : ");
        Scanner sc = new Scanner(System.in);
        String regex = "^[a-zA-Z][A-Za-z0-9_]{4,14}$";
        String useName=sc.nextLine();
        Pattern pattern=Pattern.compile(regex);
        boolean ans= pattern.matcher(useName).matches();
        if(ans==true){
            System.out.println("UserName is valid ");
        }else{
            System.out.println("UserName is invalid ");
        }

    }
}
