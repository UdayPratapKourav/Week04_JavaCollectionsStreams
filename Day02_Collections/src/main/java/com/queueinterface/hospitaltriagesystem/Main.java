package com.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Patient>priorityQueue= new PriorityQueue<>();
        priorityQueue.add(new Patient("uday",5));
        priorityQueue.add(new Patient("Adarsh",6));
        priorityQueue.add(new Patient("Sanket",2));

        System.out.println("Order of Treatment :");
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
