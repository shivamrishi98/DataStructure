package com.company.HackerankInterviewKit;

import java.util.Scanner;

public class Candies {



        // Complete the candies function below.
        static long candies(int n, int[] arr) {

            int left[] = new int[n];
            int right[] = new int[n];

            left[0]=1;
            for(int i=1;i<n;i++)
            {
                if(arr[i]>arr[i-1])
                {
                    left[i]=left[i-1]+1;
                } else {
                    left[i]=1;
                }
            }
            right[n-1]=1;
            for(int i=n-2;i>=0;i--)
            {
                if(arr[i] > arr[i+1])
                {
                    right[i]=right[i+1]+1;
                } else {
                    right[i]=1;
                }
            }

            long sum=0;

            for(int i=0;i<n;i++)
            {
                sum += Math.max(left[i],right[i]);
            }

            return sum;
        }

        private static final Scanner sc= new Scanner(System.in);

        public static void main(String[] args)  {
           int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
               arr[i]=sc.nextInt();
            }

            long result = candies(n, arr);

            System.out.println(result);
        }
    }
