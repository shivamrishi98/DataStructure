package com.company.String;

import java.util.Scanner;

public class ReverseWords
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String st[] = str.split(" ");
        int l=0,r=st.length-1;
        while(l<r)
        {
            String temp = st[l];
            st[l] = st[r];
            st[r] = temp;
            l++;
            r--;
        }

        for(String s: st)
        {
            System.out.print(s+" ");
        }
    }
}
