package com.company.Arrays;

public class segregateEvenOdd {

    public static void main(String[] args) {

        int arr[] = {1,9,6,3,4,10};

         int l=0;
         int r = arr.length -1;

         while(l<r)
         {

             while(arr[l]%2==0 && l<r)
             {
                 l++;
             }

             while (arr[r]%2!=0 && l<r)
             {
                 r--;
             }

             if(l<r)
             {
                 int temp = arr[l];
                 arr[l]=arr[r];
                 arr[r]=temp;
                 l++;
                 r--;
             }

         }
for (int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}






    }


}
