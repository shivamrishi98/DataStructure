package com.company.HackerankInterviewKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReturnPairs {

    static int sockMerchant(int n, int[] ar) {

        Set<Integer> set = new LinkedHashSet<>();
        int pairs=0;

        for(int i=0;i<n;i++)
        {
            if(!set.contains(ar[i]))
            {

                set.add(ar[i]);

            } else {
                pairs++;
                set.remove(ar[i]);
            }
        }
        Integer i = 0;
   Iterator<Integer> itr = set.iterator();
        System.out.println(itr.next());



        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();


        int[] ar = new int[n];




        for (int i = 0; i < n; i++) {
           ar[i]= scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);
    }
}
