package com.company.LinkedList;




public class LL {

    static Node head;

    public static class Node
    {
            int data;
            Node next;
    }

    public static void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null)
        {
            head = node;
        } else {
            Node n = head;

            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;

        }

    }

    public static void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public static void insertAt(int ind,int data)
    {
        Node node = new Node();
        node.data = data;


        if(ind==0)
        {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < ind - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }

    public static void deleteAtStart()
    {
        head = head.next;
    }

    public static void deleteFromEnd()
    {
        Node n = head;
        Node n1 = null;
       if (head==null) {
           System.out.println("List is empty");
       } else {

           while (n.next != null) {
               n1 = n;
               n = n.next;
           }
           n1.next = null;

       }
    }



    public static void deleteAt(int ind)
    {
        Node n = head;
        Node n1 = null;
        if(ind==0)
        {
         deleteAtStart();
        } else {
            for (int i = 0; i < ind - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public static int middle()
    {
        Node n = head;
        int count=1;
        while(n.next != null)
        {

            n=n.next;
            count++;
        }
        Node mid = head;


            for (int i = 0; i < (count / 2); i++) {
                mid = mid.next;

            }


        return mid.data;

//        Node slow = n;
//        Node fast = n;
//
//        while(fast!=null && fast.next!=null)
//        {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        return slow.data;



    }

    public static void detectLoop()
    {
        Node slow = head;
        Node fast = head;
        boolean loop = false;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                loop = true;
                break;
            }
        }

        if(loop == true)
        {
            System.out.println("LL contains loop");
        } else {
            System.out.println("LL does not contain loop");
        }


    }


    public static void reverseLL()
    {
        Node prev = null;
        Node curr =head;
        Node next = null;

        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;



    }

    public static void removeDuplicate()
    {
        Node curr = head;

        while (curr != null)
        {
            Node runner = curr;
            while (runner.next != null)
            {
                if(runner.next.data == curr.data)
                {
                    runner.next = runner.next.next;
                } else
                {
                    runner = runner.next;
                }

            }
            curr = curr.next;
        }
    }

    public void alternateOddEvenLL()
    {
        Node odd = new Node();
        Node oddHead = odd;
        Node even = new Node();
        Node evenHead = even;

        Node node = head;

        while(node != null)
        {
            if(node.data % 2 ==0)
            {

                even.next = node;
                even = even.next;
            } else {
                odd.next = node;
                odd = odd.next;
            }
            node = node.next;
        }

        odd.next = null;
        even.next = null;

        odd = oddHead.next;
        even = evenHead.next;

        Node curr = new Node();
        Node finalList = curr;

        while (odd != null && even != null)
        {
            if(odd != null)
            {

                curr.next = odd;

                curr = curr.next;
                odd = odd.next;
            }

            if(even != null)
            {
                curr.next = even;

                curr = curr.next;
                even = even.next;
            }



        }

        curr.next = odd!= null ? odd : even;

        while (finalList != null)
        {
            System.out.print(finalList.data +" ");
            finalList = finalList.next;
        }


    }


    public static void show()
    {
        Node node = head;

        while(node.next != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public static int maximumn()
    {
        Node node = head;

       int max = Integer.MIN_VALUE;

        while (node != null)
        {

            if(node.data > max)
            {
                max = node.data;
            }

                node = node.next;
        }

        return max;
    }




}
