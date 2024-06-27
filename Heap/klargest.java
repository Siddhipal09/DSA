package Heap;

import java.util.PriorityQueue;

public class klargest {
    static void kLargest(int arr[], int k)
    {
        int n= arr.length;
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
        pq.add(arr[i]);
        for(int i= k;i<n;i++)
        {
        if(arr[i]>pq.peek())
        {
            pq.poll();
            pq.add(arr[i]);
        }
    }
    System.out.println("The " + k + " largest elements are:");
    while (!pq.isEmpty()) {
        System.out.print(pq.poll() + " ");
    }
    }
    public static void main(String[] args) {
        int[] arr={5,15,10,20,8,25,18};
        int k= 3;
        kLargest(arr,k);
}
}
