package junit.performancetestingusingtimeout;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TaskUtilsTest {

    // Test for longRunningTask that should fail due to timeout
    @Test
    @Timeout(2)  // The test will fail if the method takes longer than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        String result = TaskUtils.longRunningTask();
        assertEquals("Task completed!", result);
    }
}