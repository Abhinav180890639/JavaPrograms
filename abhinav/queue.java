package com.abhinav;

public class queueADT {
    private int rear, front;
    private final int[] queue;
    private final int max;
    private int size;

    public queueADT() {
        size = 0;
        max = 50;
        rear = front = -1;
        queue = new int[max];
    }

    public boolean is_empty() {
        return front == rear;
    }

    public boolean is_full() {
        return rear == max - 1;
    }

    public void add(int element) {
        if (!is_full()) {
            queue[++rear] = element;
            size++;
        }
    }

    public int delete() {
        if (!is_empty()) {
            size--;
            return queue[++front];
        }
        return -1; // Return a sentinel value or throw an exception for empty queue
    }

    public int getFront() {
        if (!is_empty()) {
            return queue[front + 1];
        }
        return -1; // Return a sentinel value or throw an exception for empty queue
    }

    public static void main(String[] args) {
        queueADT queue = new queueADT();


        System.out.println("Is empty: " + (queue.is_empty()));
        System.out.println("Is full: " + (queue.is_full()));

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Front: " + queue.getFront());

        System.out.println("Deleted: " + queue.delete());
        System.out.println("Front: " + queue.getFront());

        System.out.println("Is empty: " + (queue.is_empty()));
        System.out.println("Is full: " + (queue.is_full()));
    }
}

