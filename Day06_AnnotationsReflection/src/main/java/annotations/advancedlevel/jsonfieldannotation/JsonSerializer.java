package annotations.advancedlevel.jsonfieldannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, String> jsonMap = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true); // Allow access to private fields

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj).toString());
            }
        }

        // Convert Map to JSON String
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": \"")
                    .append(entry.getValue()).append("\", ");
        }

        // Remove last comma and space
        if (json.length() > 2) {
            json.setLength(json.length() - 2);
        }
        json.append("}");

        return json.toString();
    }
}

