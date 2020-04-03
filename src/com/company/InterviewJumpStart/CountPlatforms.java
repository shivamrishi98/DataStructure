package com.company.InterviewJumpStart;

import java.util.Arrays;
import java.util.Scanner;

public class CountPlatforms {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arrival[] = new int[n];
    int departure[] = new int[n];
		for(int i = 0; i < n; i++){
        arrival[i] = sc.nextInt();
    }
		for(int i = 0; i < n; i++){
        departure[i] = sc.nextInt();
    }
		System.out.println(platformsNeeded(arrival, departure));
}

    public static int platformsNeeded(int arrival[], int departure[]){

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int max_plat = 1;
        int plat_need = 1;
        int i=1;
        int j=0;

        while(i<arrival.length && j < departure.length)
        {


            if(arrival[i] < departure[j])
            {
                plat_need++;
                i++;

                if(plat_need>max_plat)
                {
                    max_plat = plat_need;
                }


            } else {
                plat_need--;
                j++;
            }




        }





        return max_plat;


    }
}
