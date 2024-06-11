package BST;

public class insert {
  static  Node Insert (Node root, int x)
    {
        Node temp = new Node(x);
        Node parent = null;
        Node curr= root;
        while(curr!= null)
        {
            parent = curr;
            if(curr.Key>x)
            curr= curr.left;
           else if(curr.Key<x)
            curr= curr.right;
            else 
            return root;
        }
        if(parent == null)
        return temp;
        if(parent.Key<x)
        parent.right= temp;
        else
        parent.left= temp;
        return root;
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
        int x= 5;
        Node r= Insert(root, x);
        printList(r);

}
}
