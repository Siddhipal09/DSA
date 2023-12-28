package Sorting;
import java.util.Arrays;
public class chocolateprob {
    public static int chocolateDistribution(int arr[], int m)
    {
        int n= arr.length;
        if(m>n)
        return -1;
        Arrays.sort(arr);
        int res= arr[m-1]-arr[0];
        for(int i=1;(i+m-1)<n;i++)
        
            res= Math.min(res,(arr[i+m-1]-arr[i]));
            System.out.println(res);
            return res;
        

    }
    public static void main(String args[])
    {
        int[] arr={7,3,2,4,9,12,56};
        int m=3;
        chocolateDistribution(arr,m);
    }
}
