package Sorting;
import java.util.Arrays;
public class quicksort2 {

    public static void quickSort(int arr[], int l, int h)
    {
        if(l<h)
        {
            int p= hoarePartition(arr,l, h);
            quickSort(arr,l,p);
            quickSort(arr,p+1,h);
        }
    }
    
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
        int[] arr={8,4,7,9,3,10,5};
        int l=0;
        int h=6 ;
        quickSort(arr,l,h);
    System.out.println(Arrays.toString(arr));
        
    }
}
