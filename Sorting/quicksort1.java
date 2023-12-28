package Sorting;

import java.util.Arrays;

public class quicksort1 {
      public static void quickSort(int arr[], int l, int h)
      {
        if(l<h)
        {
            int p= lomutoPartition(arr,l,h);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
      } 
      public static int lomutoPartition(int arr[], int l, int h)
    {
        int pivot= arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
       
    }
    public static void swap(int arr[],int a,int b)
    { 
        int temp=0;
        temp =arr[a];
        arr[a]=arr[b];
       arr[b]=temp;
    }
    public static void main(String[] args) {
        int[] arr={8,4,7,9,3,10,5};
        int l=0;
        int h= 6;
        quickSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
   

}
