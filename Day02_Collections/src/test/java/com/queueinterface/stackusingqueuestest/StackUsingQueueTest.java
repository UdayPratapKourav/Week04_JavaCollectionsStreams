package com.queueinterface.stackusingqueuestest;



import com.queueinterface.stackusingqueues.StackUsingQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackUsingQueueTest {

    @Test
    public void testPushAndPop() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop()); // LIFO: Last in, first out
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testTop() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.top()); // Top should be the last pushed value
        assertEquals(10, stack.pop()); // Removing top element
        assertEquals(5, stack.top()); // Now top should be 5
    }

    @Test
    public void testIsEmpty() {
        StackUsingQueue stack = new StackUsingQueue();
        assertTrue(stack.isEmpty()); // Stack should be empty initially

        stack.push(7);
        assertFalse(stack.isEmpty()); // Stack should not be empty after push

        stack.pop();
        assertTrue(stack.isEmpty()); // Stack should be empty after popping all elements
    }

    @Test
    public void testPopFromEmptyStack() {
        StackUsingQueue stack = new StackUsingQueue();
        Exception exception = assertThrows(RuntimeException.class, stack::pop);
        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    public void testTopFromEmptyStack() {
        StackUsingQueue stack = new StackUsingQueue();
        Exception exception = assertThrows(RuntimeException.class, stack::top);
        assertEquals("Stack is empty", exception.getMessage());
    }
}
