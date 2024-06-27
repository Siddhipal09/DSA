package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyPair{
    int diff;
    int index;
    MyPair(int d, int i)
    {
        diff= d;
        index=i;
    }
}
public class kclosest {
    static void kClosest(int arr[], int x, int k)
    {
        int n= arr.length;
     PriorityQueue<MyPair> pq= new PriorityQueue<MyPair>(new Comparator<MyPair>(){
        public int compare(MyPair p1, MyPair p2) {
            return p2.diff - p1.diff; 
        }
     });
       for(int i=0;i<k;i++)
       {
        pq.offer(new MyPair(Math.abs(arr[i]-x),i));
       }
       for(int i=k;i<n;i++)
       {
        int diff= Math.abs(arr[i]-x);
        if(pq.peek().diff > diff)
        {
            pq.poll();
            pq.offer(new MyPair(diff, i));
        }
       }
       for(int i=0;i<k;i++)
       System.out.print(arr[pq.poll().index]+" ");

    }
    public static void main(String[] args) {
        {
            int[] arr={10,30,5,40,38,80,70};
            int x= 35;
            int k=3;
            kClosest(arr, x,k);
        }
    }
}
