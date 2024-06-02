package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class maxsubarray {
    static void printKMax(int[] arr, int k)
    {
        int n= arr.length;
        Deque<Integer> dq= new LinkedList<Integer>();
        for(int i=0;i<k;i++)
        {
        while(!dq.isEmpty()&&arr[i]>= arr[dq.peek()])
        dq.removeLast();
        dq.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
            System.out.println(arr[dq.peek()]);
            while(!dq.isEmpty()&&dq.peek()<=i-k)
            dq.removeFirst();
            while(!dq.isEmpty()&& arr[i]>= arr[dq.peek()])
            dq.removeLast();
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]+" ");
}
public static void main(String[] args) {
    int[] arr= {10,8,5,12,15,7,6};
    int k= 3;
    printKMax(arr, k);
}
}
