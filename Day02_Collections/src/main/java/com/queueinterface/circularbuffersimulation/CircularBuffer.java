package com.queueinterface.circularbuffersimulation;



public class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Enqueue an element (overwrite oldest if full)
    public void enqueue(int item) {
        rear = (rear + 1) % capacity;
        buffer[rear] = item;
        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Overwrite oldest
        }
    }

    // Dequeue an element
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Buffer is empty");
        }
        int item = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Buffer is empty");
        }
        return buffer[front];
    }

    // Check if the buffer is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the buffer is full
    public boolean isFull() {
        return size == capacity;
    }

    // Display the buffer contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Buffer is empty");
            return;
        }
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
