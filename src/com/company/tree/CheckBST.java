package com.company.tree;

import java.util.Scanner;
import java.lang.*;

import java.lang.Integer;
import java.util.HashMap;


public class CheckBST {


    // A Binary Search Tree node
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

        // driver function to test the above functions
        public static void main(String args[])
        {
            // Input the number of test cases you want to run
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            CheckBST ob = new CheckBST();
            while (t > 0)
            {
                HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
                int n = sc.nextInt();


                Node root = null;

                while (n > 0)
                {
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    char lr = sc.next().charAt(0);

                    //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                    Node parent = m.get(n1);
                    if (parent == null)
                    {
                        parent = new Node(n1);
                        m.put(n1, parent);
                        if (root == null)
                            root = parent;
                    }

                    Node child = new Node(n2);
                    if (lr == 'L')
                        parent.left = child;
                    else
                        parent.right = child;
                    m.put(n2, child);
                    n--;
                }

                System.out.println(isBST(root));
                //ob.printInorder(root);
                t--;

            }
        }
 public static int isBST(Node root)
        {
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
            boolean res = isBSTrec(root,min,max);

            int r=0;
            if(res==true)
            {
                r=1;
            } else {
                r=0;
            }

            return r;
        }

        public static boolean isBSTrec(Node root,int min,int max)
        {

            if(root == null)
            {
                return true;
            }

            if(root.data <= min || root.data > max)
            {
                return false;
            }


            return isBSTrec(root.left,min,root.data) && isBSTrec(root.right,root.data,max);

        }
    }



