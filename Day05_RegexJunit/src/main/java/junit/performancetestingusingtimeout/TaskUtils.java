package junit.performancetestingusingtimeout;

public class TaskUtils {

    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000);  // Simulating a task that takes 3 seconds
        return "Task completed!";
    }
}