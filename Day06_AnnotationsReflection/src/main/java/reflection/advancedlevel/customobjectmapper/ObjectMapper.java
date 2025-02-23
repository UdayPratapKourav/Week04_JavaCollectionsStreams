package reflection.advancedlevel.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                Field field;
                try {
                    field = clazz.getDeclaredField(entry.getKey());
                } catch (NoSuchFieldException e) {
                    continue; // Ignore if the field does not exist
                }
                field.setAccessible(true);
                field.set(instance, entry.getValue());
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Failed to map properties to object", e);
        }
    }
}
