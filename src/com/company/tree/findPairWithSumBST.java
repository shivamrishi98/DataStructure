package com.company.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class findPairWithSumBST {

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }

    public static Node insert(Node root, int data)
    {
        if(root == null)
        {
            return (new Node(data));
        }
        if(data < root.data)
        {
            root.left = insert(root.left, data);
        }
        else if(data > root.data)
        {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            list.clear();
            int n = sc.nextInt();
            int sum = sc.nextInt();
            Node root = null;
            for(int i = 0; i  < n; i++)
            {
                int data = sc.nextInt();
                root = insert(root, data);
            }


            boolean pairExists = findPair(root, sum);
            if(pairExists == true)
                System.out.println("1");
            else
                System.out.println("0");
        }

    }

    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static boolean findPair(Node root, int target)
    {

        if(root == null)
        {
            return false;

        }

        if(findPair(root.left,target))
        {
            return true;
        }

        if(list.contains(target - root.data))
        {
            System.out.println(" pair"+(target-root.data)+" "+root.data);
            return true;
        }
        else {
            list.add(root.data);
        }


        return findPair(root.right,target);

    }





}







