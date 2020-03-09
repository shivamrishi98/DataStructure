package com.company.CircularQueue;

public class CircularQueue {


    static int size;
    static int arr[];
    static int front;
    static int rear;
    static int capacity;

    CircularQueue(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }



    static void enqueue(int data) {
        if (isFull()) {
            System.out.println("This operation can't be performed.Queue is full");
        } else {
            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
            System.out.println(data + " enqueued to Circularqueue");
        }

    }

    static void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("This operation can't be performed.Queue is empty");
        } else {
            front = (front+1);
            size--;
        }
    }

    static boolean isFull()
    {
        if(capacity == size)
        {
            return true;
        }

        return false;
    }

    static boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }

    static void print()
    {
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[(front +i)%capacity]+" ");
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.print();

    }


}
