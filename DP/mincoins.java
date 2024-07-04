package DP;

public class mincoins {
    static int getMin( int arr[], int val)
    {
        int n= arr.length;
        int[] dp= new int[val+1];
        dp[0]=0;
        for(int i=1;i<=val;i++)
        dp[i]= Integer.MAX_VALUE;
        for(int i=1;i<=val;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]<=i)
                {
                    int sub_result= dp[i-arr[j]];
                    if(sub_result!= -1)
                    dp[i]= Math.min(dp[i], sub_result+1);
                }
            }
        }
        return dp[val];
    }
    public static void main(String[] args) {
        int[] arr={3,4,1};
        int val= 5;
        int result= getMin(arr,val);
        System.out.println(result);
    }
}
