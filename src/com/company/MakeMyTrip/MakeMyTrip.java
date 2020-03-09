package com.company.MakeMyTrip;

import java.util.Scanner;

public class MakeMyTrip {


    public static void main(String[] args) {

        int loop,inner,num,space,lines;
        Scanner sc = new Scanner(System.in);
        lines = sc.nextInt();
        space = lines;
        for(loop = 1;loop<=lines;loop++)
        {
            num=loop;
            for(inner = 1;inner<=space;inner++)
            {
                System.out.print(" ");
            }
            space--;

            for(inner = 1;inner<=loop;inner++)
            {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for(inner=1;inner<loop; inner++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
        }



    }

