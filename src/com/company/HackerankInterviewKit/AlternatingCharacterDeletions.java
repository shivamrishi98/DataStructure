package com.company.HackerankInterviewKit;

import java.util.Scanner;

public class AlternatingCharacterDeletions {

        static int alternatingCharacters(String s) {
            int count=0;

            for(int i=0;i<s.length()-1;i++)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    count++;
                }
            }

            return count;
        }

        private static final Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            String str = sc.nextLine();
            int res = alternatingCharacters(str);
            System.out.println(res);
        }
    }

