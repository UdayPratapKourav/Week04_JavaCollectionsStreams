package regex.replacemodifystrings.censorbadwords;

public class Main {
    public static void main(String[] args) {
        String text ="This is a damn bad example with some stupid words.";
        String[] badWord={"damn","stupid"};
        for(String word:badWord){
            String regex="\\b"+word+"\\b";
            text=text.replaceAll(regex,"****");
        }
        System.out.println(text);
    }
}
