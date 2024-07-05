package DP;

public class maxsum {
    static int maxSum(int arr[], int n)
    {
        int[] dp= new int[n+1];
        if(n==1)
        return arr[0];
        dp[1]= arr[0];
        dp[2]= Math.max(arr[0], arr[1]);
        for(int i=3;i<=n;i++)
        {
            dp[i]= Math.max(dp[i-1], dp[i-2]+arr[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] arr={8,7,6,10};
        int n= arr.length;
        int result= maxSum(arr,n);
        System.out.println(result);
    }
}
