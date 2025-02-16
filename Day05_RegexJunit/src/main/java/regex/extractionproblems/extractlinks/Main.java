package regex.extractionproblems.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String regex="https?://(www\\.)?[A-Za-z0-9]+\\.[a-z]{2,6}(/\\s*)?";

        String string ="Visit https://www.google..com and http://example.org for more info.";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
