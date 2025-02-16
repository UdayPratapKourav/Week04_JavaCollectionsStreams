package regex.extractionproblems.extractemailfromatext;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input="Contact us at support@example.com and info@company.org";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        List<String> emails=new ArrayList<>();
        while (matcher.find()){
            emails.add(matcher.group());
        }
        System.out.println("Emails are :");
        for(String a:emails){
            System.out.println(a);
        }

    }
}
