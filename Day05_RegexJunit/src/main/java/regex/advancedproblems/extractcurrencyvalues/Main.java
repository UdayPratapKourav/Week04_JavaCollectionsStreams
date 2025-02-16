package regex.advancedproblems.extractcurrencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "The price is $45.99, and the discount is 10.50.";
        String regex= "\\$?+[0-9]+(\\.[0-9]{2})?";
        Pattern pattern= Pattern.compile(regex);

        Matcher matcher= pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
