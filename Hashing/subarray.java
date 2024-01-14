package Hashing;

import java.util.HashSet;

public class subarray {
//    public static void is0Subarray(int arr[])
//    {
//        int n=arr.length;
//        for(int i=0;i<n;i++)
//        {
//            int curr_sum=0;
//            for(int j=i;j<n;j++)
//            {
//                curr_sum +=arr[j];
//                if(curr_sum==0)
//                {
//                    System.out.println("yes");
//                    return;
//                }
//            }
//        }
//    }
//efficient solution
public static boolean is0Subarray(int arr[])
{
    int n=arr.length;
    HashSet<Integer> s= new HashSet<Integer>();
    int pre_sum=0;
    for(int i=0;i<n;i++)
    {
        pre_sum +=arr[i];
        if(s.contains(pre_sum)||pre_sum==0)
        
          {
          
                
                System.out.println("yes");
                 return true;
            }
        
        s.add(pre_sum);
    }
    return false;
}
    public static void main(String args[])
    {
        int[] arr={4,-3,2,1};
        is0Subarray(arr);
    }
}
