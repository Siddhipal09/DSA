package Hashing;

import java.util.HashMap;

public class countdistinctele {
 //     public static void countDistinct(int arr[],int k)
 //     {
 //       int n=arr.length;
 //       for(int i=0;i<=n-k;i++)
 //       {
 //          int count=0;
 //          for(int j=0;j<k;j++)
 //          {
 //           boolean flag=false;
 //           for(int p=0;p<j;p++)
 //           {
 //               if(arr[i+j]==arr[i+p])
 //               {
 //                   flag= true;
 //                   break;
 //               }
 //               
 //           }
 //           if (flag== false)
 //               {
 //                   count++;
 //               }
 //          }
 //          System.out.println(count);
 //       }
 //     }
 //efficent solution
       public static void countDistinct(int arr[],int k)
       {
        int n= arr.length;
        HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        System.out.println(h.size());
         for(int i=k;i<n;i++)
         {
            if(h.get(arr[i-k])==1)
            {
                h.remove(arr[i-k]);
            }else{
                h.put(arr[i-k],h.get(arr[i-k])-1);
            }
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            System.out.println(h.size());
         }
        
       }
      public static void main(String args[])
      {
        int[] arr={10,10,5,3,20,5};
        int k=4;
        countDistinct(arr, k);
      }
}
