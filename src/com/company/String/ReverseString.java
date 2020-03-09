package com.company.String;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char c[]= str.toCharArray();
        int l=0,r=c.length-1;
        while(l<r)
        {
            char temp = c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }

        for(char ch: c)
        {
            System.out.print(ch+"");
        }
    }
}
