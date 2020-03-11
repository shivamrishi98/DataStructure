package com.company.HackerankInterviewKit;

import java.util.Scanner;

public class CountSwapInBubbleSort {

    static void countSwaps(int[] a) {
        int swapCount=0;
        int n=a.length;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swapCount++;
                    swap(a,j, j + 1);
                }
            }

        }

        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

    static void swap(int ar[],int a,int b)
    {
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
  arr[i]=sc.nextInt();
        }

        countSwaps(arr);

    }
}

