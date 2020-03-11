package com.company.HackerankInterviewKit;

import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int max=0;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<=k)
            {
                max++;
                k=k-prices[i];

            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
     int res  = maximumToys(arr,k);
        System.out.println(res);
    }


}
