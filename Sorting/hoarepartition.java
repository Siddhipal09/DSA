package Sorting;

import java.util.Arrays;

public class hoarepartition {
        public static int hoarePartition(int arr[],int l,int h)
        {
            int i=l-1;
            int j=h+1;
            int pivot=arr[l];
            while(true)
            {
                do{
                    i++;
                }while(arr[i]<pivot);
                do{
                    j--;
                }while(arr[j]>pivot);
                if(i>=j)
                {
                    
                    return j;
                
                }
                swap(arr,i,j);

            }
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
        int[] arr={5,3,8,4,2,7,1,10};
        int l=0;
        int h=7;
        hoarePartition(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
}
