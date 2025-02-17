package com.queueinterface.reversequeue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>queue= new LinkedList<>();
        Collections.addAll(queue,10,20,30);

        System.out.println(ReverseQueue.reverseQueue(queue).toString());
    }
}
