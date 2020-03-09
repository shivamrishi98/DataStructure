package com.company.SortingAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        int n = arr.length;

        int i,j,min_ind;

        for(i=0;i<n-1;i++)
        {
            min_ind = i;

            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_ind])
                {
                  min_ind = j;

                  swap(arr,min_ind,i);
                }
            }


        }

        for (i=0;i<n;i++) {

            System.out.print(arr[i]+" ");

        }


    }

    static void swap(int arr[],int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
