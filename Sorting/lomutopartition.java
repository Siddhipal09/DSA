package Sorting;

import java.util.Arrays;

public class lomutopartition {
    public static void lomutoPartition(int arr[], int l, int h)
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
       
    }
    public static void swap(int arr[],int a,int b)
    { 
        int temp=0;
        temp =arr[a];
        arr[a]=arr[b];
       arr[b]=temp;
   

    }
    public static void main(String args[])
    {
        int[] arr={10,80,30,90,40,50,70};
        int l=0;
        int h=6;
        lomutoPartition(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
}
