package Hashing;

import java.util.HashSet;

public class countdistinct {
 //   public static void countDistinct(int arr[])
 //   {
 //       int n=arr.length;
 //       int res= 0;
 //       for(int i=0;i<n;i++)
 //       {
 //          boolean flag=false;
 //         for(int j=0;j<i;j++)
 //         {
 //           if (arr[i]==arr[j])
 //           {
 //            flag= true;
 //            break;
 //           }
 //         }
 //         if(flag==false)
 //         res++;
 //       }
 //       System.out.println(res);
 //   }
 //efficient solution using HashSet
    public static void countDistinct(int arr[])
    {
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            s.add(arr[i]);

        }
        System.out.println(s.size());
    }
    public static void main(String args[])
    {
        int[] arr={10,20,10,20,30};
        countDistinct(arr);
    }
}
