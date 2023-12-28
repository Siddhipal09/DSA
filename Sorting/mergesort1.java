package Sorting;
import java.util.Arrays;
public class mergesort1 {
    public static void mergeSort(int a[],int b[])
    {
        int m=a.length;
        int n=b.length;
        int[]c=new int[m+n];
        for(int i=0;i<m;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            c[m+i]=b[i];
        }
        sort(c);
        System.out.println(Arrays.toString(c));
    }
    public static void sort(int arr[])
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
       int a[]={10,15,20,20};
       int b[]={1,2};
       mergeSort(a,b);
       
    }
    
}
//efficient solution 
//public static void mergeSort(int a[],int b[])
//{
    //int m=a.length;
    //int n=b.length;
    //int i=0,j=0;
    //while(i<m&&j<n)
    //{
        //if(a[i]<=b[j])
        //{
            //System.out.println(a[i]+"");
            //i++;
       // }
       //else{System.out.println(b[j]+"");
        //j++;
      // }
    //}
//while(i<m)
//{
//System.out.println(a[i]+"");
//i++;
//}
//while(j<n)
//{
    //System.out.println(b[j]);
    //j++;
//}
//}

    
    

