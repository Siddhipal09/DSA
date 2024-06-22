package BST;

public class checkbst {
    static boolean isBST(Node root, int min, int max)
    {
        if(root== null)
        return true;
        return(root.Key > min && root.Key< max && isBST(root.left, min, root.Key) && isBST(root.right,root.Key, max) );
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(45);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
       boolean bst= isBST(root, min, max);
       System.out.println(bst);
}
}
