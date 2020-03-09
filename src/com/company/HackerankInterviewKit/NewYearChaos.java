package com.company.HackerankInterviewKit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewYearChaos {





    static void minimumBribes(int[] arr) {
          int swapCount=0;
          for(int i=arr.length-1;i>=0;i--)
          {
              if(arr[i]!=i+1)
              {
                  if(arr[i-1]==(i+1) && (i+1)>=0)
                  {
                      swapCount++;
                      swap(arr,i,i-1);
                  } else if(arr[i-2]==(i+1)&&(i+2)>=0)
                  {
                      swapCount+=2;
                      swap(arr,i-2,i-1);
                      swap(arr,i-1,i);
                  } else {
                      System.out.println("Too chaotic");
                    return;
                  }
              }


          }

        System.out.println(swapCount);
    }

    static void swap(int arr[],int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            int[] q = new int[n];


            for (int i = 0; i < n; i++) {
                q[i] = scanner.nextInt();

            }



             minimumBribes(q);

        }


    }

}
