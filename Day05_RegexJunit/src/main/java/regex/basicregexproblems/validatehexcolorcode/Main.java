package regex.basicregexproblems.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="^#([0-9A-Fa-f]{3}|[0-9A-Fa-f]{6})$";
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        Pattern pattern= Pattern.compile(regex);
        boolean ans=pattern.matcher(input).matches();
        if(ans==true){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
