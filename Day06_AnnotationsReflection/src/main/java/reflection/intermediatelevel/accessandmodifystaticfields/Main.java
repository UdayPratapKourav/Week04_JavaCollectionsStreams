package reflection.intermediatelevel.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try{
            Class<Configuration>cls=Configuration.class;
            Field apiKeyField = cls.getDeclaredField("API_KEY");


            apiKeyField.setAccessible(true);


            apiKeyField.set(null, "NEW_API_KEY_123");


            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }

