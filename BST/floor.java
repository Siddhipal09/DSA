package BST;

public class floor {
   static Node Floor(Node root, int x)
   {
    Node res= null;
    while(root!= null)
    {
        if(root.Key== x)
        return root;
        else if(root.Key>x)
        root= root.left;
        else{
            res= root;
            root= root.right;
        }
    }
    System.out.println(res.Key);
    return res;
   }
   public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(30);
    root.right = new Node(70);
    root.right.left = new Node(60);
    root.right.right = new Node(80);
    root.left.left = new Node(10);
    root.left.right = new Node(40);
    int x= 15;
    Floor(root,x);
}
}
