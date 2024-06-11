package Tree;

import java.util.ArrayList;
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
public class deserialize {
    static final int EMPTY = -1;
    static int index =0;
    static Node deSerialize(ArrayList<Integer> arr)
    {
        if(index == arr.size())
        return null;
        int val = arr.get(index);
        index++;
        if(val == EMPTY)
        return null;
        Node root = new Node(val);
        root.left= deSerialize(arr);
        root.right= deSerialize(arr);
        return root;
    }
    public static void printList(Node root) {
        if (root != null) {
            System.out.print(root.Key + " ");
            printList(root.left);
            
            printList(root.right);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(-1);
        arr.add(-1);
        arr.add(-1);
        Node ds= deSerialize(arr);
        printList(ds);
}
}
