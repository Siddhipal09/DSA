package Hashing;

public class longestsubarray {
    public static void maxlen(int arr[], int sum)
    {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
        int curr_sum=0;
        for(int j=i;j<n;j++)
        {
            curr_sum +=arr[j];
            if(curr_sum==sum)
            {
                res= Math.max(res,j-i+1);
            }
        }
    }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        int[] arr={5,8,-4,-4,9,-2,2};
        int sum=0;
        maxlen(arr,sum);
    }
}
