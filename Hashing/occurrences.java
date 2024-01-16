package Hashing;

import java.util.Arrays;

public class occurrences {
    public static void printNbyK(int arr[], int k)
    {
        int n= arr.length;
        int count=1;
        int i=1;
        Arrays.sort(arr);
        while(i<n)
        {
            while((i<n)&&(arr[i-1]==arr[i]))
            {
                count++;
                i++;
            }
            if(count>(n/k))
            {
                System.out.println(arr[i-1]);
            }
            count=1;
            i++;
        }
    }
    public static void main(String args[])
    {
        int[] arr={30,10,20,20,10,20,30,30};
        int k=4;
        printNbyK(arr,k);
    }
}
