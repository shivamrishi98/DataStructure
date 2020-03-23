package com.company.InterviewJumpStart;

import java.util.Scanner;

public class BackspaceProblem {
    public static String backspace(String s){

        StringBuilder str = new StringBuilder(s);

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='#')
            {
                str.delete(i-1,i+1);
                i=i-2;
            }
        }


        return str.toString();
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String x=backspace(n);
        System.out.print(x);
    }

}
