
//Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
//
//        Input:
//        The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains 3 lines . The first line contains 3 space separated integers N, M, X. Then in the next two lines are space separated values of the array A and B respectively.
//
//        Output:
//        For each test case in a new line print the sorted space separated values of all the pairs u,v where u belongs to array A and v belongs to array B, such that each pair is separated from the other by a ',' without quotes also add a space after the ',' . If no such pair exist print -1.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= N, M, X <= 106
//        -106 <= A, B <= 106
//
//        Example:
//        Input:
//        2
//        5 5 9
//        1 2 4 5 7
//        5 6 3 4 8
//        2 2 3
//        0 2
//        1 3
//        Output:
//        1 8, 4 5, 5 4
//        0 3, 2 1
//
//        Explanation:
//        Testcase 1: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.

package com.company.HackerankInterviewKit;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class FindPairsWithSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++)
        {


            int sizeOfArray1 = sc.nextInt();
            int sizeOfArray2 = sc.nextInt();
            int arr1[] = new int[sizeOfArray1];
            int arr2[] = new int[sizeOfArray2];


            int target = sc.nextInt();

            for(int i=0;i<sizeOfArray1;i++)
            {
                arr1[i]=sc.nextInt();
            }
            HashSet<Integer> hs = new HashSet<>();
            for(int j=0;j<sizeOfArray2;j++)
            {
                arr2[j]=sc.nextInt();
                hs.add(arr2[j]);
            }
            Arrays.sort(arr1);
            String result = "";
            for(int i=0;i<arr1.length;i++)
            {
                if(hs.contains(target-arr1[i]))
                {
                    result += arr1[i]+" "+(target-arr1[i])+", ";
                }
            }

            if(result.equals(""))
            {
                System.out.println("-1");
            } else {
                System.out.println(result.substring(0,result.length()-2));
            }

        }
    }
}
