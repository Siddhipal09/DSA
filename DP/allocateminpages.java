package DP;

public class allocateminpages {
    static int allocateMinPages(int arr[], int n, int k)
    {
        int[][] dp= new int[k+1][n+1];
        for(int i=1;i<=n;i++)
        dp[1][i]= Sum(arr, 0,i-1);
        for(int j=1;j<=k;j++)
        dp[j][1]= arr[0];
        for(int i=2;i<=k;i++)
        {
            for(int j=2;j<=n;j++)
            {
                int res= Integer.MAX_VALUE;
                for(int p=1;p<j;p++)
                 res= Math.min(res, Math.max(dp[i-1][p], Sum(arr,p,j-1)));
                dp[i][j]= res;
            }
        }
        return dp[k][n];
    }
    static int Sum(int arr[], int a, int b)
    {
        int s=0;
        for(int i=a; i<=b;i++)
        s+= arr[i];
        return s;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int n= arr.length;
        int k=2;
        int result= allocateMinPages(arr, n, k);
        System.out.println(result);
    }

}
