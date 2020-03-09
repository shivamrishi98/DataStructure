package com.company.Arrays;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }

        findSubArray(arr);

    }

    static void findSubArray(int arr[])
    {
        int n = arr.length;


        for(int i=0;i<n;i++)
        {
            for(int grp=i;grp<n;grp++)
            {
                for(int j=i;j<=grp;j++)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();

            }
        }



    }
}
