package Sorting;

import java.util.Arrays;

public class mindiffarray {
  //  public static int getMinDiff(int arr[])
 //   {
 //       int n=arr.length;
 //       int res= Integer.MAX_VALUE;
 //       for(int i=0;i<n;i++)
 //       {
 //           for(int j=i+1;j<n;j++)
 //           {
 //               res= Math.min(res,Math.abs(arr[i]-arr[j]));
 //           }
 //       }
 //       System.out.println(res);
 //       return res;
 //   }
   public static int getMinDiff(int arr[])
   {
    int n= arr.length;
    Arrays.sort(arr);
    int res= Integer.MAX_VALUE;
    for(int i=1;i<n;i++)
    {
        res= Math.min(res,(arr[i]-arr[i-1]));
    }
    System.out.println(res);
    return res;
   }
    public static void main(String arg[])
    {
        int arr[]={1,8,12,5,18};
        getMinDiff(arr);
    }
}
