package Tree;

import java.util.Stack;

public class inorder {
  static void iterativeInorder(Node root)
  {
    Stack<Node> s= new Stack<Node>();
    Node curr= root;
    while(curr!= null|| s.isEmpty()== false)
    {
        while(curr!= null)
        {
        s.push(curr);
        curr= curr.left;
        }
    
    curr= s.pop();
    System.out.print(curr.Key+" ");
    curr= curr.right;
    }
  }
  public static void main(String[] args) {
    Node root = new Node(10);
   root.left = new Node(20);
   root.right = new Node(30);
   root.left.left = new Node(8);
   root.left.right = new Node(7);
   root.right.right = new Node(6);
   root.left.right.left = new Node(9);
   root.left.right.right = new Node(15);
   iterativeInorder(root);
}
}
