package com.company.Arrays;

import java.util.Scanner;

public class MaximumSubArraySum {

   static public int findSubArraySum(int arr[])
    {
        int  n = arr.length;
        int maxSum = arr[0];
        int sum = arr[0];
        for(int i=1;i<n;i++)
        {
            if(sum<0)
            {
                sum = arr[i];
            } else {
                sum = sum+arr[i];
            }

            maxSum = Math.max(sum,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res = findSubArraySum(arr);

        System.out.println(res);



    }


}
