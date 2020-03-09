package com.company.SortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {2,4,3,1,5};
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



}
