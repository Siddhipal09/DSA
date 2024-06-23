package BST;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
    Node node;
    int hd;
    Pair(Node n, int h)
    {
        node = n;
        hd= h;
    }
}
public class bottomview {
    static void bottomView(Node root)
     {
        Queue<Pair> q= new LinkedList<Pair>();
        TreeMap <Integer, Integer> mp = new TreeMap<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair p= q.poll();
            Node curr= p.node;
            int hd= p.hd;
                mp.put(hd,curr.Key);
            
            if(curr.left!= null)
            q.add(new Pair(curr.left, hd-1));
            if(curr.right!= null)
            q.add(new Pair(curr.right, hd+1));

        }
        for(Map.Entry<Integer, Integer>p: mp.entrySet())
        {
            System.out.print(p.getValue()+" ");
            System.out.println();
        }
     }
     public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        bottomView(root);
}
}

