package regex.advancedproblems.findrepeatingwords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        String regex="\\b(\\w+)\\b";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        Map<String,Integer> map=new HashMap<>();

        while (matcher.find()){
            String word= matcher.group().toLowerCase();

            map.put(word,map.getOrDefault(word,0)+1);
        }

        System.out.println("Repeating words :");
        boolean found =false;
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"  ");
                found=true;
            }
        }
        if(!found){
            System.out.println("None");
        }

    }
}
