package Sorting;
import java.util.Arrays;
public class mergesort2 {
    public static void mergeSort(int a[],int low,int mid,int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int[]left=new int[n1];
        int[]right=new int[n2];
        for(int i=0;i<n1;i++)
        {
          left[i]=a[low+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=a[n1+i];
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<n1&&j<n2)
        {
            if(left[i]<=right[j])
            {
                a[k]=left[i];
                i++;
                k++;
            }else{
                a[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1)
        {
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=right[j];
            j++;
            k++;
        }
    }
    public static void main(String args[])
    {
       int[]a={10,15,20,40,8,11,55};
      int low=0;
      int mid=3;
      int high=6;
      mergeSort(a,low,mid,high);
      System.out.println(Arrays.toString(a));
        
    }
}
