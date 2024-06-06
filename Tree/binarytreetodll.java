package Tree;

public class binarytreetodll {
   static Node prev= null;
    static Node binaryTreeToDll(Node root)
    {
        if(root== null)
        return root;
        Node head = binaryTreeToDll(root.left);
        if(prev== null)
        {
            head= root;
        }
        else{
            root.left= prev;
            prev.right= root;
        }
        prev= root;
        binaryTreeToDll(root.right);
        return head;
    }
    public static void printList(Node head)
    {
        Node curr= head;
        while(curr!= null)
        {
            System.out.print(curr.Key+ " ");
            curr=curr.right;
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
         Node dll= binaryTreeToDll(root);
         printList(dll);
       
}

}