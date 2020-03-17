package com.company.HackerankInterviewKit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FlippingBits {

    static long flippingBits(long n) {

        long maxValue = (long) Math.pow(2,32)-1;

        return maxValue ^ n;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        long num = sc.nextLong();

        long res = flippingBits(num);
        System.out.println(res);
    }
}
