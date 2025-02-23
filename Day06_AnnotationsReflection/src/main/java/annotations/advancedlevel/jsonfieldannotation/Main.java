package annotations.advancedlevel.jsonfieldannotation;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User(101, "Bobby", "bobby@example.com");

        String jsonString = JsonSerializer.toJson(user);
        System.out.println(jsonString);
    }
}

