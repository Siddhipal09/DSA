package Hashing;

import java.util.HashSet;

public class pair {
 //   public static void isPair(int arr[],int sum)
 //   {
 //       int n=arr.length;
 //       for(int i=0;i<n;i++)
 //       {
 //           for(int j=i+1;j<n;j++)
 //           {
 //               if(arr[i]+arr[j]==sum)
 //               {
 //                   System.out.println("yes");
 //                   return;
 //               }
 //           }
 //       }
 //       System.out.println("no");
 //   }
 //efficient solution
 public static void isPair(int arr[],int sum)
 {
    int n=arr.length;
    HashSet<Integer>s=new HashSet<Integer>();
    for(int i=0;i<n;i++)
    {
        if(s.contains(sum-arr[i]))
        {
            System.out.println("yes");
        }
        s.add(arr[i]);
    }
 }
    public static void main(String args[])
    {
        int[] arr={3,2,8,15,-8};
        int sum=17;
        isPair(arr,sum);
    }
    
}
