package Hashing;

public class subarray {
    public static void is0Subarray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int curr_sum=0;
            for(int j=i;j<n;j++)
            {
                curr_sum +=arr[j];
                if(curr_sum==0)
                {
                    System.out.println("yes");
                    return;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int[] arr={4,-3,2,1};
        is0Subarray(arr);
    }
}
