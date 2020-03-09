package com.company.HackerankInterviewKit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumSwapsToSort
{

    static int minimumSwaps(int[] arr) {

        boolean isVisited[] = new boolean[arr.length+1];
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=1;i<isVisited.length;i++)
        {
            hm.put(i,arr[i-1]);
        }

        int count = 0;

        for(int i=1;i<hm.size();i++)
        {
            int nextNode;
            if(isVisited[i]==false)
            {
                isVisited[i]=true;
            }

            if(i==hm.get(i))
            {
                continue;
            } else {
                int c = hm.get(i);

                while(!isVisited[c])
                {
                    isVisited[c]=true;
                    nextNode=hm.get(c);
                    c=nextNode;
                    count++;
                }
            }




        }


        return count;




    }



    private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();

            int[] arr = new int[n];


            for (int i = 0; i < n; i++) {

                arr[i] = scanner.nextInt();
            }

            int res = minimumSwaps(arr);


        }
}
