package DP;

public class lcs {
 // using memoization   
 //   static int Lcs(String s1, String s2)
 //   {
 //       int m= s1.length();
 //       int n= s2.length();
 //       int[][] memo = new int[m+1][n+1];
 //       for(int i=0;i<m+1;i++)
 //       {
 //           for(int j=0;j<n+1;j++)
 //           {
 //               memo[i][j]=-1;
 //           }
 //       }
 //       return lcsHelper(s1,s2,m,n,memo);
 //   }
 //   static int lcsHelper(String s1, String s2, int m, int n,int[][] memo)
 //  {
 //       if(memo[m][n]!=-1)
 //       return memo[m][n];
 //       if(m==0||n==0)
 //       memo[m][n]=0;
 //       else
 //       {
 //           if(s1.charAt(m-1)==s2.charAt(n-1))
 //           memo[m][n]= 1+lcsHelper(s1, s2, m-1, n-1, memo);
 //           else 
 //           memo[m][n]= Math.max(lcsHelper(s1, s2, m-1, n, memo), lcsHelper(s1, s2, m, n-1, memo));
 //       }
 //       return memo[m][n];
 //   }
 // using tabulation
      static int Lcs(String s1, String s2)
      {
        int m= s1.length();
        int n= s2.length();
        int[][] dp= new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        dp[i][0]=0;
        for(int j=0;j<=n;j++)
        dp[0][j]=0;
        for(int i=1;i<=m;i++)
        for(int j=1;j<=n;j++)
        if(s1.charAt(i-1)==s2.charAt(j-1))
        dp[i][j]= 1+dp[i-1][j-1];
        else
        dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
        return dp[m][n];

      }
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2="AEDFHR";
        int result= Lcs(s1,s2);
        System.out.println(result);
    }
}
