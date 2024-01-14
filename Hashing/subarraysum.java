package Hashing;

public class subarraysum {
    public static void subarraySum(int arr[], int sum)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            int curr_sum=0;
            for(int j=i;j<n;j++)
            {
                curr_sum +=arr[j];
                if(curr_sum==sum)
                {
                    System.out.println("yes");
                    return;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={5,8,6,13,3,-1};
        int sum=22;
        subarraySum(arr,sum);
    }
}
