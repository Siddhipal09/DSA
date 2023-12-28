package Sorting;
import java.util.Arrays;
public class selectionsort
{
    public static void selectionSort(int arr[])
    {
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;

                }
                
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
       

    }
    public static void main(String args[])
    {
       int arr[]={10,5,8,2,20};
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
