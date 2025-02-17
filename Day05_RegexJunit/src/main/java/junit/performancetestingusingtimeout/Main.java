package junit.performancetestingusingtimeout;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Starting the long-running task...");
            String result = TaskUtils.longRunningTask();  // Calling the long-running task
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            System.err.println("The task was interrupted.");
        }
    }
}
