package reflection.advancedlevel.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Custom Inject Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

// Dependency Injection Container
class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> clazz) throws Exception {
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        T instance = constructor.newInstance();
        instances.put(clazz, instance);
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = (T) instances.get(clazz);
        if (instance == null) {
            register(clazz);
            instance = (T) instances.get(clazz);
        }
        injectDependencies(instance);
        return instance;
    }

    private void injectDependencies(Object instance) throws Exception {
        for (Field field : instance.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> dependencyClass = field.getType();
                Object dependency = getInstance(dependencyClass);
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
    }
}

// Sample Service
class Service {
    public void execute() {
        System.out.println("Service Executed!");
    }
}

// Client Class with Dependency Injection
class Client {
    @Inject
    private Service service;

    public void run() {
        service.execute();
    }
}

public class DependencyInjectionDemo {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        container.register(Service.class);

        Client client = container.getInstance(Client.class);
        client.run(); // Should print "Service Executed!"
    }
}
