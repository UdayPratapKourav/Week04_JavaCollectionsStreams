package com.queueinterface.reversequeue;

import java.util.Queue;

public class ReverseQueue {
    public static Queue<Integer>reverseQueue(Queue<Integer>queue){
        if(queue.isEmpty()){
            return queue;
        }
        int front=queue.poll();
        queue=reverseQueue(queue);
        queue.add(front);

        return queue;
    }
}
