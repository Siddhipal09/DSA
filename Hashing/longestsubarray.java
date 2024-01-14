package Hashing;

import java.util.HashMap;

public class longestsubarray {
//    public static void maxlen(int arr[], int sum)
//    {
//        int n=arr.length;
//        int res=0;
//        for(int i=0;i<n;i++)
//        {
//        int curr_sum=0;
//        for(int j=i;j<n;j++)
//        {
//            curr_sum +=arr[j];
//            if(curr_sum==sum)
//            {
//                res= Math.max(res,j-i+1);
//            }
//        }
//    }
//        System.out.println(res);
//    }
//efficient solution
        public static void maxlen(int arr[],int sum)
        {
            int n= arr.length;
            HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
            int pre_sum=0;
            int res=0;
            for(int i=0;i<n;i++)
            {
                pre_sum += arr[i];
                if(pre_sum ==sum)
                {
                    res=i+1;
                }
                if(m.containsKey(pre_sum)==false)
                {
                    m.put(pre_sum,i);
                }
                if(m.containsKey(pre_sum-sum))
                {
                    res= Math.max(res,i-m.get(pre_sum-sum));
                }

            }
            System.out.println(res);
        }  
    public static void main(String args[])
    {
        int[] arr={8,3,1,5,-6,6,2,2};
        int sum=4;
        maxlen(arr,sum);
    }
}
