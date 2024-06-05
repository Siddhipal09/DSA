package Tree;

public class size {
    static int getSize(Node root)
    {
        if(root== null)
        return 0;
        else{
            return(1+ getSize(root.left)+getSize(root.right));
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        int size= getSize(root);
        System.out.println(size);
}
}