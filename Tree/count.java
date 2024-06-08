package Tree;

public class count {
    static int countNode(Node root)
    {
        if(root== null)
        return 0;
        else{
            return(1+ countNode(root.left)+countNode(root.right));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        int count= countNode(root);
        System.out.println(count);
}
}