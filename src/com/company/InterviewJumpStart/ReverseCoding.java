package com.company.InterviewJumpStart;

import java.util.Scanner;

public class ReverseCoding {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = sc.nextInt();

        if (num % 2 == 0) {
            int res = (num / 2) * (num + 1);

            if (res == ans) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } else {
            double dnum = num;
            double res = Math.ceil(dnum / 2) * num;

            if (res == ans) {
                System.out.println("Yes");
            } else {

                System.out.println("No");
            }
        }
    }
}
