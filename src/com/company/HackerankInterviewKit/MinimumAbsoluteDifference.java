package com.company.HackerankInterviewKit;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {

    static int minimumAbsoluteDifference(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);
   int min = Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n-1;i++)
        {
               int absDiff = Math.abs((arr[i]-arr[i+1]));
               if(absDiff<min)
               {
                   min = absDiff;
               }
        }
        return min;

    }



    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      int arr[] = new int[n];

      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }

      int result = minimumAbsoluteDifference(arr);
        System.out.println(result);

    }
}


