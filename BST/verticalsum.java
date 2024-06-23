package BST;

import java.util.Map;
import java.util.TreeMap;

public class verticalsum {
    static void vSumR(Node root, int hd, TreeMap<Integer, Integer> mp)
    {
        if(root== null)
        return;
     vSumR(root.left, hd-1, mp);
     int pSum= (mp.get(hd)==null? 0: mp.get(hd));
     mp.put(hd, pSum+root.Key);
     vSumR( root.right, hd+1, mp);
    }
    static void vSum(Node root)
    {
     TreeMap<Integer, Integer> mp= new TreeMap<Integer, Integer>();
       vSumR(root, 0, mp);
       for(Map.Entry<Integer, Integer> sum:mp.entrySet())
       System.out.print(sum.getValue()+" ");

    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        vSum(root);
}
}
