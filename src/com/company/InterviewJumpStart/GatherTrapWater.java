package com.company.InterviewJumpStart;

import java.util.Scanner;

public class GatherTrapWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res=0;
        int level=0;
        int l=0;
        int r=arr.length-1;

        while(l < r)
        {
            int lower = arr[ arr[l]<arr[r] ? l++ : r-- ];

            level = Math.max(level,lower);

            res += level - lower;



        }


        System.out.println(res);

    }
}
