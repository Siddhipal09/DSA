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
public class levelordertraversal {
    static void levelOrderTraversal(Node root)
    {
        Queue<Node>q= new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()== false)
        {
            Node curr= q.poll();
            System.out.print(curr.Key+" ");
            if(curr.left!= null)
            q.add(curr.left);
            if(curr.right!= null)
            q.add(curr.right);
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
        levelOrderTraversal(root);
    }
}
