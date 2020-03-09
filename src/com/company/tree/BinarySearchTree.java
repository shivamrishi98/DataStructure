package com.company.tree;

public class BinarySearchTree {


    static class Node
    {
     Node left;
     Node right;
     int key;

     Node(int data)
     {
         key = data;
         left=null;
         right=null;
     }

    }



    static Node root;


    BinarySearchTree() {
        root = null;
    }


    static void ins(int key)
    {
        root = insRec(root,key);

    }

    static Node insRec(Node root,int key)
    {

        if(root==null)
        {
            root = new Node(key);
            return root;

        }

        if (key < root.key)
        {
            root.left = insRec(root.left,key);
        } else if(key > root.key)
        {
            root.right = insRec(root.right,key);
        }

        return root;

    }

    static public void del(int key)
    {

        root = delRec(root,key);

    }


   static public  Node delRec(Node root, int key)
    {
        if(root == null)
        {
            return null;
        }

        if (key < root.key)
        {
            root.left = delRec(root.left,key);
        } else if(key > root.key) {
        root.right   = delRec(root.right,key);
        } else if(root.left == null || root.right ==null)
        {
            Node temp = null;
            temp = root.left == null ? root.right : root.left;

            if(temp == null)
            {
                return null;
            } else {
                return temp;
            }
        } else {
            Node successor = getSuccessor(root);
            root.key = successor.key;
            root.right = delRec(root.right,successor.key);
        }




        return root;
    }

    static public Node getSuccessor(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node temp = root.right;

        while(temp.left != null)
        {
            temp = temp.left;
        }

   return temp;
    }



    static void inorder()
    {
        System.out.println("InOrder:");
        inorderRec(root);
        System.out.println();
    }

    static void inorderRec(Node root) {

        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key+ " ");

            inorderRec(root.right);
        }


    }

    static void preorder()
    {
        System.out.println("PreOrder:");
        preorderRec(root);
        System.out.println();
    }

    static void preorderRec(Node root) {

        if (root != null) {
            System.out.print(root.key +" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }

    }

    static void postorder()
    {
        System.out.println("PostOrder:");
        postorderRec(root);
    }

    static void postorderRec(Node root) {

        if (root != null) {
             postorderRec(root.left);
             postorderRec(root.right);
             System.out.print(root.key + " ");
        }


    }

    static public int countNodes()
    {
        return countN(root);
    }

    static public int countN(Node root)
    {
        if(root == null)
        {
            return 0;
        } else {
            int c = 1;

            c += countN(root.left);
            c += countN(root.right);


            return c;
        }

    }

   public static boolean search(int val)
   {

       return searchRec(root,val);
   }

    public static boolean searchRec(Node root, int val)
    {
        boolean found = false;

        while((root != null) && !found )
        {
            int rVal = root.key;
            if(val < rVal)
            {
                root = root.left;
            } else if(val > rVal)
            {
                root = root.right;
            } else {
                found = true;
                break;
            }

             found = searchRec(root,val);

        }

        return found;

    }



    static public int inorderS(int key)
    {

        root = inorderSuccessor(root,key);


        return root.key;

    }


      public static Node inorderSuccessor(Node root,int key)
      {

          if(root == null)
          {
              return null;
          }

          Node successor = null;

          while (root != null) {
              if (key < root.key) {
                  successor = root;
                  root = root.left;
              } else if (key > root.key) {
                  root = root.right;
              } else {
                  if (root.right != null) {
                      successor = getSuccessor(root);
                  }
                  break;
              }
          }
          return root != null ? successor : null;




      }



    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();


        bst.ins(8);
//        bst.ins(5);
        bst.ins(3);
        bst.ins(7 );
        bst.ins(10);
        bst.ins(15);
        bst.ins(2);
        bst.ins(42);
        bst.ins(21);
        System.out.println(bst.inorderS(7));
//        bst.ins(10);
//        bst.ins(26);
//        bst.ins(52);
//        bst.ins(36);
//        bst.ins(47);
//        bst.ins(82);
//        bst.ins(5);
//        bst.ins(62);
//
//    bst.del(2);
        bst.inorder();
        bst.preorder();
        bst.postorder();

        System.out.println(bst.search(7));
        System.out.println(countNodes());

    }



}
