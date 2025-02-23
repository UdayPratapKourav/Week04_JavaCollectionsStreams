package annotations.intermediatelevel.loggingmethodexecutiontime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            // Start time
            long start = System.nanoTime();
            Object result = method.invoke(target, args);
            // End time
            long end = System.nanoTime();
            System.out.println(method.getName() + " executed in " + (end - start) / 1_000_000.0 + " ms");
            return result;
        }
        return method.invoke(target, args);
    }

    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, new LoggingProxyHandler(target));
    }
}

