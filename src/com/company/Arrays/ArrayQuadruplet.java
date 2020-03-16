package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuadruplet {

    static int[] findArrayQuadruplet(int[] arr, int s) {
        // your code goes here

        int n = arr.length;


        if (n < 4)
        {
            return new int[0];
        }

        Arrays.sort(arr);

        for(int i=0;i<=n-4;i++)
        {
            for(int j=i+1;j<=n-3;j++)
            {
                int r = s-(arr[i]+arr[j]);


                int low = j + 1, high = n - 1;

                while (low < high)
                {
                    if (arr[low] + arr[high] < r)
                    {
                        low++;
                    } else if (arr[low] + arr[high] > r)
                    {
                        high--;
                    }else{

                        return new int[] {arr[i],arr[j],arr[low],arr[high]};
                    }

                }}
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        int sum = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int b[] = findArrayQuadruplet(arr,sum);

        for(int bb=0;bb<b.length;bb++)
        {
            System.out.print(b[bb]+" ");
        }
    }


}



