package BST;

import java.util.ArrayList;
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
public class verticaltraversal {
     static void verticalTraversal(Node root)
     {
        Queue<Pair> q= new LinkedList<Pair>();
        TreeMap <Integer, ArrayList<Integer>> mp = new TreeMap<>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty())
        {
            Pair p= q.poll();
            Node curr= p.node;
            int hd= p.hd;
            if(mp.containsKey(hd))
            mp.get(hd).add(curr.Key);
            else{
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(curr.Key);
                mp.put(hd,al);
            }
            if(curr.left!= null)
            q.add(new Pair(curr.left, hd-1));
            if(curr.right!= null)
            q.add(new Pair(curr.right, hd+1));

        }
        for(Map.Entry<Integer, ArrayList<Integer>>p: mp.entrySet())
        {
            ArrayList<Integer> al = p.getValue();
            for(int x: al)
            System.out.print(x+" ");
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
        verticalTraversal(root);
}
}