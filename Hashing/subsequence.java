package Hashing;

import java.util.Arrays;

public class subsequence {
     public static void longestSubsequence(int arr[])
     {
        int n=arr.length;
        Arrays.sort(arr);
        int res=1;
        int curr=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1]+1)
            {
                curr++;
            }else{
                res=Math.max(res,curr);
                curr=1;
            }
        }
        res=Math.max(res,curr);
        System.out.println(res);
     }
     public static void main(String args[])
     {
        int[] arr={1,9,3,4,2,10,13};
        longestSubsequence(arr);
     }
}
