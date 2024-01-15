package Hashing;

import java.util.HashMap;

public class commonspan {
//    public static void commonSpan(int arr1[], int arr2[])
//    {
//        int n= arr1.length;
//        int res=0;
//        for(int i=0;i<n;i++)
//        {
//            int sum1=0;
//            int sum2=0;
//            for(int j=i;j<n;j++)
//            {
//                sum1 += arr1[j];
//                sum2 += arr2[j];
//                if(sum1==sum2)
//                res=Math.max(res,j-i+1);
//            }
//
//        }
//        System.out.println(res);
//    }
//efficient solution
      public static void commonSpan(int arr1[], int arr2[])
      {
        int n=arr1.length;
        int[] temp= new int[n];
       
        for(int i=0;i<n;i++)
        {
            temp[i]= arr1[i]-arr2[i];
        }
        int res=0;
        int sum=0;
        HashMap<Integer,Integer> m= new HashMap<Integer,Integer>();
          for(int i=0;i<n;i++)
          {
            sum += temp[i];
            if(sum==0)
            {
                res=i+1;
            }else if(m.containsKey(sum))
            {
                res= Math.max(res,i-m.get(sum));
            }else{
                m.put(sum,i);
            }
          }
          System.out.println(res);
        
      }
    public static void main(String args[])
    {
        int[] arr1={0,1,0,0,0,0};
        int[] arr2={1,0,1,0,0,1};
        commonSpan(arr1,arr2);
    }
}
