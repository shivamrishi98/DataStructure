package com.company.Arrays;

import java.util.Scanner;

public class SumOfOtherElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(",");
        int total = 0;
        for(int i=0;i<str.length;i++)
        {
            total += Integer.parseInt(str[i]);
        }

        for(int i=0;i<str.length;i++)
        {
            if(i+1 <= str.length)
            {
                System.out.print(",");
            }
            int num = Integer.parseInt(str[i]);
            System.out.print(total-num);
        }
    }
}
