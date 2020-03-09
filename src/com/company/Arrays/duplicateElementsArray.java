package com.company.Arrays;

public class duplicateElementsArray {

    public static void main(String[] args) {
        int arr[] = {1,3,2,4,1,2,2,4,3,5};



        for(int i=0;i<arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                     arr[j]--;

                }
            }

            System.out.print(arr[i]+ " ");

        }




    }


}
