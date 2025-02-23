package reflection.advancedlevel.JSONrepresentation;

import java.lang.reflect.Field;

class JsonSerializer {
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                String key = fields[i].getName();
                Object value = fields[i].get(obj);
                json.append("\"" + key + "\": \"" + value + "\"");
                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonSerializerDemo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        String json = JsonSerializer.toJson(person);
        System.out.println(json);
    }
}
