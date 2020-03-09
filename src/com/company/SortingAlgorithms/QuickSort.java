package com.company.SortingAlgorithms;

public class QuickSort {

    public static void main(String[] args) {
    int arr[] = {10,80,30,90,40,50,70};
    int low=0;
    int high = arr.length-1;
    quickSort(arr,low,high);

    for(int i=low;i<=high;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }

    static void quickSort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int part = partition(arr,low,high);


            quickSort(arr,low,part-1);
            quickSort(arr,part+1,high);
        }

    }

    static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {

            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }


        }
        swap(arr,i+1,high);

        return i+1;


    }

    static void swap(int arr[],int a,int b)
    {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}



