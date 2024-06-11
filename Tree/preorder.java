package Tree;

import java.util.Stack;

public class preorder {
    static void preOrder(Node root)
    {
        if(root== null)
        return;
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while(st.isEmpty()==false)
        {
            Node curr = st.pop();
            System.out.print(curr.Key+" ");
            if(curr.right!=null)
            st.push(curr.right);
            if(curr.left!=null)
            st.push(curr.left);
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
       preOrder(root);
}
}
