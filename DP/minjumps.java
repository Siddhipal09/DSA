package DP;

public class minjumps {
    //recursive
  static int minJumps(int arr[], int n)
    {
        if(n==1)
        return 0;
        int res= Integer.MAX_VALUE;
        for(int i=0;i<=n-2;i++)
        {
           
            if(i+arr[i]>=n-1)
            {
                int sub_res= minJumps(arr, i+1);
                if(sub_res!= Integer.MAX_VALUE)
                res= Math.min(res, sub_res+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={3,4,2,1,2,1};
        int n= arr.length;
        int result= minJumps(arr, n);
        System.out.println(result);
    }
}
