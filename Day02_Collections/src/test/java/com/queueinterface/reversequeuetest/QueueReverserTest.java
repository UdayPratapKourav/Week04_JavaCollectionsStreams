package com.queueinterface.reversequeuetest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueReverserTest {

    public static Queue<Integer>reverseQueue(Queue<Integer>queue){
        if(queue.isEmpty()){
            return queue;
        }
        int front=queue.poll();
        queue=reverseQueue(queue);
        queue.add(front);

        return queue;
    }

    @Test
    public void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversedQueue = reverseQueue(queue);

        // Expected output: [30, 20, 10]
        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(30);
        expectedQueue.add(20);
        expectedQueue.add(10);

        assertEquals(expectedQueue, reversedQueue);
    }

    @Test
    public void testEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> reversedQueue = reverseQueue(queue);;
        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    public void testSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);

        Queue<Integer> reversedQueue = reverseQueue(queue);;

        Queue<Integer> expectedQueue = new LinkedList<>();
        expectedQueue.add(5);

        assertEquals(expectedQueue, reversedQueue);
    }
}
