package reflection.advancedlevel.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Define an interface
interface Greeting {
    void sayHello(String name);
}

// Implementation of Greeting
class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Dynamic Proxy Handler
class LoggingHandler implements InvocationHandler {
    private final Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method: " + method.getName());
        return method.invoke(target, args);
    }
}

public class DynamicProxyDemo {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        // Create a dynamic proxy instance
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(greeting)
        );

        // Call method on proxy instance
        proxyInstance.sayHello("Uday");
    }
}
