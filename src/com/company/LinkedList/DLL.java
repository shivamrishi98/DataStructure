package com.company.LinkedList;

public class DLL {


    static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = null;



    static public void ins_beg(int data)
    {

        Node newnode = new Node(data);

        newnode.next = head;
        newnode.prev = null;

        if(head != null)
        {
            head.prev = newnode;
        }

        head = newnode;


    }

    static public void ins_end(int data)
    {
        Node newnode = new Node(data);



        if(head == null)
        {
            head = tail = newnode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            newnode.next = null;
        }
    }

      public static void insert(int data,int ind)
      {

    if(ind==1)
    {
        ins_beg(data);
    } else {
        Node runner = head;
        for (int i = 1; i < ind - 1; ++i) {
            runner = runner.next;
        }


        Node node = new Node(data);
        node.next = runner.next;
        node.prev = runner;
        runner.next = node;
        runner = runner.next;
        runner.prev = node;

    }
      }


    static public void print()
    {
        Node current = head;

        if(head == null)
        {
            System.out.println("list is empty");
        } else {

            while (current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
        }
    }




}
