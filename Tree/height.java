package Tree;
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
public class height {
   static int treeHeight(Node root)
    {
        if(root== null)
        return 0;
        else
        {
        return(Math.max(treeHeight(root.left), treeHeight(root.right))+1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int calc= treeHeight(root);
        System.out.println(calc);
    }
}
