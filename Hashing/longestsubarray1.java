package Hashing;

import java.util.HashMap;

public class longestsubarray1 {
 //   public static void longestSub(int arr[])
 //   {
 //       int n= arr.length;
 //       int res=0;
 //       for(int i=0;i<n;i++)
 //       {
 //           int c0=0;
 //           int c1=0;
 //           for(int j=i;j<n;j++)
 //           {
 //               if(arr[j]==0)
 //               {
 //                   c0++;
 //               }
 //               else{
 //                   c1++;
 //               }
 //               if(c0==c1)
 //               {
 //                   res=Math.max(res,j-i+1);
 //               }
 //           }
 //       }
 //       System.out.println(res);
 //   }
 //efficient solution
     public static void longestSub(int arr[]) {
        int n = arr.length;
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0) {
                
                res = i + 1;
            } else if (map.containsKey(sum)) {
                
                res = Math.max(res, i - map.get(sum));
            } else {
               
                map.put(sum, i);
            }
        }

        System.out.println(res);
    }
    public static void main(String args[])
    {
        int[] arr={1,0,1,1,1,0,0};
        longestSub(arr);
    }
}
