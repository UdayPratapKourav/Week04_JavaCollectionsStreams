package annotations.intermediatelevel.loggingmethodexecutiontime;

public class Main {
    public static void main(String[] args) {
        Service service = LoggingProxyHandler.createProxy(new MyService(), Service.class);
        // Measure execution time
        service.fastMethod();
        service.slowMethod();
    }
}

