package com.company.InterviewJumpStart;

import java.util.Scanner;

public class LeadersInArray {


    public static void leaders(int[] input) {

        int size=input.length;
        for(int i=0;i<size;i++)
        {
            int j;
            for(j=i+1;j<size;j++)
            {
                if(input[i]<input[j])
                {
                    break;
                }


            }
            if(j==size)
            {
                System.out.print(input[i]+" ");
            }

        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = s.nextInt();
        }
        leaders(input);
    }

}
