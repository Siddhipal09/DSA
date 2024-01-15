package Hashing;

//import java.util.Arrays;
import java.util.HashSet;

public class subsequence {
 //    public static void longestSubsequence(int arr[])
 //    {
 //       int n=arr.length;
 //       Arrays.sort(arr);
 //       int res=1;
 //       int curr=1;
 //       for(int i=1;i<n;i++)
 //       {
 //           if(arr[i]==arr[i-1]+1)
 //           {
 //               curr++;
 //           }else{
 //               res=Math.max(res,curr);
 //               curr=1;
 //           }
 //       }
 //       res=Math.max(res,curr);
 //       System.out.println(res);
 //    }
 //efficient solution
          public static void longestSubsequence(int arr[])
          {
            int n= arr.length;
            int res=0;
             
            HashSet<Integer> h= new HashSet<Integer>();
            for(int i=0;i<n;i++)
            {
                h.add(arr[i]);
            }
            for(int i=0;i<n;i++)
            {   
                if(h.contains(arr[i]-1)==false)
                {
                 int  curr=1;
                while(h.contains(arr[i]+curr))
                {
                    curr++;
                }
                res=Math.max(res,curr);
            }
            }
            System.out.println(res);
          }
     public static void main(String args[])
     {
        int[] arr={1,9,3,4,2,10,13};
        longestSubsequence(arr);
     }
}
