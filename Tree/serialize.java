package Tree;

import java.util.ArrayList;

public class serialize {
    static final int EMPTY = -1;
    static void Serialize(Node root, ArrayList<Integer>arr)
     {
        if(root== null)
        {
           arr.add(EMPTY);
            return;
        }
        arr.add(root.Key);
        Serialize(root.left, arr);
        Serialize(root.right, arr);
     }
     public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Serialize(root, arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    
}
}
