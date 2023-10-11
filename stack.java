package com.abhinav;

public class stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stackArray[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        stack stack = new stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top of the stack: " + stack.peek());

        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        System.out.println("Stack size after popping: " + stack.size());
    }
}
