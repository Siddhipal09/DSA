package Hashing;

public class commonspan {
    public static void commonSpan(int arr1[], int arr2[])
    {
        int n= arr1.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            int sum1=0;
            int sum2=0;
            for(int j=i;j<n;j++)
            {
                sum1 += arr1[j];
                sum2 += arr2[j];
                if(sum1==sum2)
                res=Math.max(res,j-i+1);
            }

        }
        System.out.println(res);
    }
    public static void main(String args[])
    {
        int[] arr1={0,1,0,0,0,0};
        int[] arr2={1,0,1,0,0,1};
        commonSpan(arr1,arr2);
    }
}
