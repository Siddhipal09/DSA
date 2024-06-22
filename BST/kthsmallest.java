package BST;
class Node{
    int Key;
    Node left, right;
    int lcount;
    Node(int x)
    {
        Key = x;
        left= null;
        right= null;
        lcount= 0;
    }
}
public class kthsmallest {

   static void updateLCount(Node root) {
        if (root == null) {
            return;
        }
        root.lcount = getCount(root.left);
        updateLCount(root.left);
        updateLCount(root.right);
    }

   static int getCount(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + getCount(root.left) + getCount(root.right);
    }

    static int kthSmallest(Node root, int K)
    {
        if (root == null) {
            return -1; 
        }
        int count = root.lcount + 1;
        if (count == K) {
            return root.Key; 
        }
        if (count > K) {
            return kthSmallest(root.left, K); 
        }

        return kthSmallest(root.right, K - count); 
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        int K = 3;
        updateLCount(root);
        int s= kthSmallest(root, K);
        System.out.println(s);
}
}
    
    

