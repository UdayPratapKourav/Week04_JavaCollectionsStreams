package com.queueinterface.stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer>queue1;
    Queue<Integer>queue2;

    public StackUsingQueue(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public void push(int x){
        queue1.add(x);
    }
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Last element in queue1 is the stack's top element
        int result = queue1.poll();

        // Swap queue1 and queue2 to restore queue1 as main queue
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return result;
    }


    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move elements to queue2, except the last one
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Get the last element (top of stack)
        int topElement = queue1.poll();
        queue2.add(topElement);

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

}
