package Heap;

import java.util.PriorityQueue;

public class sortk {
    static void sortK(int arr[], int k)
    {
        int n= arr.length;
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i=0;i<=k;i++)
        pq.add(arr[i]);
        int index=0;
        for(int i= k+1;i< n;i++)
        {
           arr[index++]= pq.poll();
           pq.add(arr[i]);
        }
        while(pq.isEmpty()== false)
        arr[index++]= pq.poll();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr={9,8,7,18,19,17};
        int k= 2;
        sortK(arr,k);
    }
}
