package regex.extractionproblems.extractcapitalizedwords;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="[A-Z]+[a-z]{1,}";
        String string="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
