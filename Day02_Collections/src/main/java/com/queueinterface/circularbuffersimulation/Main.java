package com.queueinterface.circularbuffersimulation;



public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display(); // Output: Buffer: 1 2 3

        buffer.enqueue(4); // Overwrites oldest (1)
        buffer.display(); // Output: Buffer: 2 3 4

        System.out.println("Dequeued: " + buffer.dequeue()); // Output: 2
        buffer.display(); // Output: Buffer: 3 4

        buffer.enqueue(5);
        buffer.display(); // Output: Buffer: 3 4 5
    }
}
