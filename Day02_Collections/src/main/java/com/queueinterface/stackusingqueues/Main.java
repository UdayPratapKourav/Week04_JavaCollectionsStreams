package com.queueinterface.stackusingqueues;

public class Main {
    public static void main(String[] args) {
       StackUsingQueue stack=new StackUsingQueue();
       stack.push(10);
       stack.push(20);
       stack.push(30);
        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Top element after pop: " + stack.top()); // Output: 2


    }
}
