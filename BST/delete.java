package BST;

public class delete {
    static Node delNode(Node root, int x)
    {
        if(root== null)
        return null;
        if(root.Key< x)
        root.right= delNode(root.right, x);
       else if(root.Key> x)
        root.left= delNode(root.left, x);
        else
        {
            if(root.left== null)
            return root.right;
            else if(root.right== null)
            return root.left;
            else{
                Node succ= getSucc(root);
                root.Key= succ.Key;
                root.right= delNode(root.right, succ.Key);
            }
          
        }
        return root;
    }
    static Node getSucc(Node root)
    {
        Node curr= root.right;
        while(curr!=null&& curr.left!= null)
        curr= curr.left;
        return curr;
    }
    public static void printList(Node root) {
        if (root != null) {
            System.out.print(root.Key + " ");
            printList(root.left);
            
            printList(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        int x= 80;
       Node r= delNode(root,x);
       printList(r);

}
}
