package BST;
class Node{
    int Key;
    Node left;
    Node right;
    Node(int x)
    {
        Key= x;
    }
}
public class search {
    static boolean Search(Node root, int x)
    {
        if(root== null)
        return false;
        if(root.Key== x)
        return true;
        else if(x> root.Key)
        return Search(root.right, x);
        else 
        return Search(root.left, x);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        int x= 10;
        boolean s = Search(root, x);
        System.out.print(s);
    }
}
