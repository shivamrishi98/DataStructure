package com.company.SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,1,6};
        int n = arr.length;
        int key,i,j;
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j=i-1;

            while(j>=0 && arr[j] > key)
            {
                arr[j+1]=arr[j];
                j = j-1;
            }
            arr[j+1]=key;

        }


        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }
}
