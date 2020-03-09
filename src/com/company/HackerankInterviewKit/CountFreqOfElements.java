package com.company.HackerankInterviewKit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFreqOfElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strArr[] = str.split(" ");

        Map<String,Integer> hm = new HashMap<String,Integer>();

   int index=0;
        for(String i : strArr)
        {
            Integer j = hm.get(i);
            hm.put(strArr[index],(j==null) ? 1 : j+1);
  index++;
        }

        for(Map.Entry<String,Integer> val : hm.entrySet() )
        {
            System.out.println(val.getKey()+" : "+val.getValue());
        }




    }

}
