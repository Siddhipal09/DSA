package Hashing;

import java.util.HashSet;

public class subarraysum {
 //   public static void subarraySum(int arr[], int sum)
 //   {
 //       int n= arr.length;
 //       for(int i=0;i<n;i++)
 //       {
 //           int curr_sum=0;
 //           for(int j=i;j<n;j++)
 //           {
 //               curr_sum +=arr[j];
 //               if(curr_sum==sum)
 //               {
 //                   System.out.println("yes");
 //                   return;
 //               }
 //           }
 //       }
 //   }
 //efficient solution
     public static void subarraySum(int arr[], int sum)
     {
        int n=arr.length;
        HashSet<Integer> s= new HashSet<Integer>();
        int pre_sum=0;
        for(int i=0;i<n;i++)
        {
             pre_sum +=arr[i];
           if(pre_sum==sum||s.contains(pre_sum-sum))
           {
           System.out.println("yes");
           return;
        }
            s.add(pre_sum);
        }
        
     }
    public static void main(String args[])
    {
        int[] arr={5,8,6,13,3,-1};
        int sum=22;
        subarraySum(arr,sum);
    }
}
