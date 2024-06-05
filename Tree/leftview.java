package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class leftview {
 //   static int maxlevel = 0;
 //   static void printLeft(Node root, int level)
 //   {
 //       if(root== null)
 //       return;
 //       if(maxlevel< level)
 //       {
 //           System.out.print(root.Key+" ");
 //           maxlevel = level;
 //       }
 //       printLeft(root.left, level+1);
 //       printLeft(root.right, level+1);
 //   }
 //   static void printLeftView(Node root)
 //   {
 //       printLeft(root, 1);
 //   }
 //method2 iterative
     static void printLeftView(Node root)
     {
        if(root== null)
        return;
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()== false)
        {
            int count = q.size();
            for(int i=0;i< count;i++)
            {
                Node curr= q.poll();
                if(i==0)
                System.out.print(curr.Key+" ");
                if(curr.left!= null)
                q.add(curr.left);
                if(curr.right!= null)
                q.add(curr.right);
            }
        }
     }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        printLeftView(root);
}
}
