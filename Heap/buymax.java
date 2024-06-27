package Heap;

import java.util.PriorityQueue;

public class buymax {
    static void buyMax(int cost[], int sum)
    {
        int count=0;
        int n= cost.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
       
        for(int i=0;i<n;i++)
        pq.add(cost[i]);
        while(!pq.isEmpty() && pq.peek()<= sum)
        {
           
         sum= sum- pq.poll(); 
         count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr={1,12,5,111,200};
        int sum= 10;
        buyMax(arr,sum);
    }
}
