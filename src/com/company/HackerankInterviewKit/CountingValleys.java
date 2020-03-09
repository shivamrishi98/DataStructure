package com.company.HackerankInterviewKit;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

scanner.nextLine();
        String s = scanner.nextLine();

        int result = countingValleys(n,s);

        System.out.println(result);
    }

    static int countingValleys(int n, String s) {
        int v =0;
        int lvl = 0;

        for(char c: s.toCharArray())
        {
            if(c=='U')
            {
                lvl++;
            }

            if(c=='D')
            {
                lvl--;
            }

            if(lvl==0 && c=='U')
            {
                v++;
            }
        }


        return v;

    }
}
