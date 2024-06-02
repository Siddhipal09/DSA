package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class minmax {
    Deque<Integer> dq;
    minmax()
    {
        dq= new LinkedList<Integer>();
    }
     void insertMin(int x)
    {
        System.out.println(dq.offerFirst(x));
    }
     void insertMax(int x)
    {
        System.out.println(dq.offerLast(x));
    }
     void getMin()
    {
        System.out.println(dq.peekFirst());
    }
    void getMax()
    {
        System.out.println(dq.peekLast());
    }
     void extractMin()
    {
        System.out.println(dq.pollFirst());
    }
     void extractMax()
    {
        System.out.println(dq.pollLast());
    }
    public static void main(String[] args) {
        minmax minmax = new minmax();
        minmax.insertMin(5);
        minmax.insertMax(10);
        minmax.insertMin(3);
        minmax.insertMax(15);
        minmax.insertMin(2);
        minmax.getMin();
        minmax.getMax();
        minmax.insertMin(1);
        minmax.getMin();
        minmax.insertMax(20);
        minmax.getMax();
    }
}
