package com.company.InterviewJumpStart;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class checkSubSet {

    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {

        boolean check = false;



        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<n1;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<n2;i++)
        {
            if(set.contains(arr2[i]))
            {
                check=true;
                set.remove(arr2[i]);

            } else {
                check=false;
                break;
            }
        }


        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(CheckSubset(arr,arr.length,arr1,arr1.length));
    }

}
