package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int Key;
    Node left;
    Node right;

Node(int K)
{
    Key = K;
    left= right= null;
}
}
public class linebylinetraversal {
    static void printLineByLine(Node root)
    {
        if(root== null)
        return;
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size()>1)
        {
            Node curr = q.poll();
            if(curr== null)
            {
                System.out.println();
                q.add(null);
            }else{
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
        root.left.left = new Node(8);
        root.left.right = new Node(7);
        root.right.right = new Node(6);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(15);
        printLineByLine(root);
    }

}
