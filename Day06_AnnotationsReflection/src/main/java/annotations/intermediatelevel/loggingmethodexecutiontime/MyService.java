package annotations.intermediatelevel.loggingmethodexecutiontime;



class MyService implements Service {
    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executing fastMethod...");
    }

    @LogExecutionTime
    public void slowMethod() {
        System.out.println("Executing slowMethod...");
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
    }
}

