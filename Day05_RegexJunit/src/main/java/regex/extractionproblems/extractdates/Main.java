package regex.extractionproblems.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="[0-9]{2}+/[0-9]{2}+/[0-9]{4}";
        String string ="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
