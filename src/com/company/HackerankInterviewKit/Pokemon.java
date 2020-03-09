package com.company.HackerankInterviewKit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pokemon {
    /* IMPORTANT: Multiple classes and nested static classes are supported */

        public static void main(String args[] ) throws Exception {

            //Scanner
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            int strength = sc.nextInt();
            for (int l = 0; l < t; l++) {
                int arr[] = new int[strength + 1];
                int k = sc.nextInt();
                int count = 0;
                Map<Integer, Integer> hm = new HashMap<>();
                for (int j = 1; j <= strength; j++) {
                    count = 0;
                    for (int i = 1; i <= j; i++) {

                        if (j % i == 0) {
                            count++;

                            hm.put(j, count);

                        }
                    }
                }
                int count1 = 0;
                for (Map.Entry m : hm.entrySet()) {
                    System.out.print(m.getValue() + " ");

                    System.out.println(count1);
                }


            }

        }
}
