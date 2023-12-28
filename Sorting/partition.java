package Sorting;
import java.util.Arrays;
public class partition
{
    public static void partitionArray(int arr[], int l, int h, int p)
     {
        int [] temp= new int[h-l+1];
        int index= 0;
        for(int i=l;i<=h;i++)
        {
            if(arr[i]<=arr[p])
            {
            temp[index]= arr[i];
            index++;
            }
        }
        for(int i=l;i<=h;i++)
        {
            if(arr[i]>arr[p])
            {
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=l;i<=h;i++)
        {
           arr[i]=temp[i-l];
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,13,6,9,12,11,8};
        int l=0;
        int h=6;
        int p=6;
        partitionArray(arr,l,h,p);
        System.out.println(Arrays.toString(arr));
        }
}
