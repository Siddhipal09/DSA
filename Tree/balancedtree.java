package Tree;

public class balancedtree {
    static boolean isBalanced(Node root)
    {
        if(root== null)
        return true;
        int lh= height(root.left);
        int rh= height(root.right);
        return ((Math.abs(lh-rh)<=1) && isBalanced(root.left) && isBalanced(root.right));
    }
    static int height(Node root)
    {
        if(root== null)
        return 0;
        else
        {
        return(Math.max(height(root.left), height(root.right))+1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(18);
        root.left = new Node(4);
        root.right = new Node(20);
        root.right.left = new Node(13);
        root.right.right = new Node(70);
        boolean balancetree= isBalanced(root);
        System.out.println(balancetree);
    }
}
