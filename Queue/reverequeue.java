package Queue;

import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;

public class reverequeue {
   
    //recursive solution
    static void reverseQueue(Queue<Integer>q)
    {
        if(q.isEmpty())
        return;
        int x= q.poll();
        reverseQueue(q);
        q.offer(x);
    }
    public static void main(String args[])
    {
        Queue<Integer> q= new LinkedList<Integer>();
        q.add(10);
        q.add(5);
        q.add(15);
        q.add(20);
        reverseQueue(q);
        System.out.print(q);

    }
}
