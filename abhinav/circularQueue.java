package com.abhinav;

public class circularQueue {
    private int Rear, Front;
    private final int[] Queue;
    private final int Max;
    private int Size;

    public circularQueue() {
        Size = 0;
        Max = 50;
        Rear = Front = -1;
        Queue = new int[Max];
    }

    public boolean isEmpty() {
        return Front == Rear;
    }

    public boolean isFull() {
        return Rear == (Front - 1 + Max) % Max;
    }


    public void Add(int Element) {
        if (!isFull()) {
            Rear = (Rear + 1) % Max;
            Queue[Rear] = Element;
            Size++;
        }
    }

    public int Delete() {
        if (!isEmpty()) {
            Front = (Front + 1) % Max;
            Size--;
            return Queue[Front];
        }
        return -1;
    }

    public int getFront() {
        int Temp;
        if (!isEmpty()) {
            Temp = (Front + 1) % Max;
            return Queue[Temp];
        }
        return -1;
    }

    public static void main(String[] args) {
        circularQueue Q = new circularQueue();
        Q.Add(11);
        Q.Add(12);
        Q.Add(13);
        System.out.println("Front: "+Q.getFront());
        System.out.println("Element deleted: "+Q.Delete());
        Q.Add(14);
        System.out.println("Size: "+Q.Size);
        System.out.println("Element deleted: "+Q.Delete());
        System.out.println("Element deleted: "+Q.Delete());
        System.out.println("Element deleted: "+Q.Delete());
        System.out.println("Element deleted: "+Q.Delete());
        Q.Add(15);
        Q.Add(16);
        System.out.println("Element deleted: "+Q.Delete());
        System.out.println("Front: "+Q.getFront());
    }
}
