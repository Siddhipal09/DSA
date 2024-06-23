package BST;

public class fixbst {
 static Node prev= null, first= null, second= null;
    static void fixBST(Node root)
    {
        if(root== null)
        return;
        fixBST(root.left);
        if(prev!= null&& root.Key<prev.Key)
        {
            if(first== null)
            first= prev;
            second= root;
        }
        prev= root;
        fixBST(root.right);
    }
    static void swap(Node a, Node b) {
        int temp = a.Key;
        a.Key = b.Key;
        b.Key = temp;
    }
    static void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.Key + " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(60);
        root.right = new Node(80);
        root.right.left = new Node(8);
        root.right.right = new Node(100);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        fixBST(root);
        if (first != null && second != null) {
            swap(first, second);
        }
        inorderTraversal(root);
}
}
