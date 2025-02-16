package regex.advancedproblems.extractprogramminglanguagenames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex="\\b(JavaScript|Java|Python|Go)\\b";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
