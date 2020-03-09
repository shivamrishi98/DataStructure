package com.company.Arrays;

public class ArrayLeftEvenRightOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]%2==0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i--;
            }

        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
