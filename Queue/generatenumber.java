package Queue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class generatenumber {
     static void generateNumbers(int n)
     {
        Queue<String> q= new LinkedList<String>();
        q.offer("5");
        q.offer("6");
        for(int i=0;i<n;i++)
        {
            String curr= q.poll();
            System.out.print(curr+" ");
            q.offer(curr+"5");
            q.offer(curr+"6");

        }
     }
     public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("ENTER THE NUMBER");
        int n= sc.nextInt();
        generateNumbers(n);
        
        }finally
        {
            sc.close();
        }

     }
}
