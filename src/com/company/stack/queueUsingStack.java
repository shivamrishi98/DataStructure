package com.company.stack;

import java.util.Stack;

public class queueUsingStack {

    static Stack<Integer> st1 = new Stack<>();
   static Stack<Integer> st2 = new Stack<>();

    static public void enqueue(int val)
    {

        while(!st1.isEmpty())
        {
         st2.push(st1.pop());
        }

        st1.push(val);

        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }

    }

    static public int dequeue()
    {
        if(st1.isEmpty())
        {
            System.out.println("Empty");
        }
            int x = st1.peek();
            st1.pop();

            return x;

    }

    static public void print() {
        while (st1.isEmpty()==false) {
            System.out.println(st1.pop());
        }


    }

    public static void main(String[] args) {
        queueUsingStack qus = new queueUsingStack();
        qus.enqueue(5);
        qus.enqueue(2);
        qus.enqueue(53);
        qus.enqueue(5);
        qus.print();
    }
}
