package com.queueinterface.circularbuffersimulationtest;



import com.queueinterface.circularbuffersimulation.CircularBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {

    @Test
    public void testEnqueueAndDequeue() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(10);
        buffer.enqueue(20);
        buffer.enqueue(30);

        assertEquals(10, buffer.dequeue());
        assertEquals(20, buffer.dequeue());
        assertEquals(30, buffer.dequeue());
    }

    @Test
    public void testOverwriteOldest() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4); // Overwrites 1

        assertEquals(2, buffer.dequeue()); // Oldest remaining element
        assertEquals(3, buffer.dequeue());
        assertEquals(4, buffer.dequeue());
    }

    @Test
    public void testPeek() {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.enqueue(100);
        assertEquals(100, buffer.peek());
        assertFalse(buffer.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        CircularBuffer buffer = new CircularBuffer(3);
        assertTrue(buffer.isEmpty());

        buffer.enqueue(5);
        assertFalse(buffer.isEmpty());

        buffer.dequeue();
        assertTrue(buffer.isEmpty());
    }

    @Test
    public void testIsFull() {
        CircularBuffer buffer = new CircularBuffer(2);
        buffer.enqueue(1);
        buffer.enqueue(2);
        assertTrue(buffer.isFull());

        buffer.dequeue();
        assertFalse(buffer.isFull());
    }

    @Test
    public void testDequeueFromEmptyBuffer() {
        CircularBuffer buffer = new CircularBuffer(3);
        Exception exception = assertThrows(RuntimeException.class, buffer::dequeue);
        assertEquals("Buffer is empty", exception.getMessage());
    }
}
