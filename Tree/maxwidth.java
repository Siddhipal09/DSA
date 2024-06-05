package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class maxwidth {
    static int maxWidth(Node root)
    {
        if(root== null)
        return 0;
        Queue<Node> q= new LinkedList<Node>();
        q.add(root);
        int res= 0;
        while(q.isEmpty()== false)
        {
            int count= q.size();
            res= Math.max(res, count);
            for(int i=0;i<count;i++)
            {
                Node curr= q.poll();
                if(curr.left!= null)
                q.add(curr.left);
                if(curr.right!= null)
                q.add(curr.right);
            }
        }
        return res;
    }
     public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(4);
        root.right = new Node(20);
        root.right.left = new Node(13);
        root.right.right = new Node(70);
        int result= maxWidth(root);
        System.out.println(result);
}
}