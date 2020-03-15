package com.company.stack;

import java.util.Stack;

public class NextGreaterElement {

    static void nextGreaterElement(int arr[])
    {
        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);


        for(int i=1;i<arr.length;i++) {

            while (!st.isEmpty() && st.peek() < arr[i]) {
                System.out.println(st.pop() + " ---> " + arr[i]);
            }

                st.push(arr[i]);


        }
            while (!st.isEmpty()) {
                int top = st.pop();

                System.out.println(top + " ---> -1");
            }


        }





    public static void main(String[] args) {


        int arr[] = { 98, 23, 54, 12, 20, 7, 27 };
        nextGreaterElement(arr);


    }


}
