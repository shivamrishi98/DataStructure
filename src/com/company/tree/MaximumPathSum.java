package com.company.tree;

import java.util.Scanner;

class Node {
    public int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class MaximumPathSum {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                if (n == 0) {
                    System.out.println(0);
                    continue;
                }
                Node root = null;
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    int a1 = sc.nextInt();
                    char lr = sc.next().charAt(0);
                    if (i == 0) {
                        root = new Node(a);

                        switch (lr) {
                            case 'L':
                                root.left = new Node(a1);

                                break;
                            case 'R':
                                root.right = new Node(a1);

                                break;
                        }
                    } else {
                        insert(root, a, a1, lr);
                    }
                }

                System.out.println(maxPathSum(root));
            }
        }

    public static int maxPathSum(Node root) {
        // your code here
        int[] max = new int[1];
        solve(root, max);
        return max[0];
    }

    static int solve(Node node, int[] max) {
        if (node == null) return 0;
        int left = solve(node.left, max);
        int right = solve(node.right, max);
        max[0] = Math.max(max[0], left + right + node.data);
        return node.data + Math.max(left, right);
    }

        public static void insert(Node root, int a, int a1, char lr) {
            if (root == null) {
                return;
            }
            if (root.data == a) {
                switch (lr) {
                    case 'L':
                        root.left = new Node(a1);
                        break;
                    case 'R':
                        root.right = new Node(a1);
                        break;
                }
                return;
            }
            insert(root.left, a, a1, lr);
            insert(root.right, a, a1, lr);
        }
    }



