package com.company.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestToArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,-1,6,1,8};
        int currVal = 0;
        int closArr = arr[0];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            currVal = arr[i]*arr[i];
            if(currVal <= (closArr * closArr)) {
                if (arr[i] > 0) {
                    closArr = arr[i];
                }
            }
        }

        System.out.println(closArr);

    }
}
