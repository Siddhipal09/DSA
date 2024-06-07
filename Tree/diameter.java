package Tree;

public class diameter {
    static int treeHeight(Node root)
    {
        if(root== null)
        return 0;
        else
        {
        return(Math.max(treeHeight(root.left), treeHeight(root.right))+1);
        }
    }
    static int dia(Node root)
    {
        if(root== null)
        return 0;
        int d1= 1+ treeHeight(root.left)+treeHeight(root.right);
        int d2= dia(root.left);
        int d3= dia(root.right);
        return Math.max(d1, Math.max(d2,d3));
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int treeDiameter= dia(root);
        System.out.println(treeDiameter);
}
}
