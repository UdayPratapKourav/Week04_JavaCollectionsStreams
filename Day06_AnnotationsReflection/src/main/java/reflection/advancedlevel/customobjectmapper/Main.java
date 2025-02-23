package reflection.advancedlevel.customobjectmapper;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> userData = Map.of("name", "John Doe", "age", 30);
        User user = ObjectMapper.toObject(User.class, userData);
        System.out.println(user);
    }
}
