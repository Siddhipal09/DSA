package BST;

import java.util.HashSet;

public class pairsum {
  static boolean isPairSum(Node root, int sum, HashSet<Integer> s)
  {
    if(root== null)
    return false;
    if(isPairSum(root.left, sum, s)== true)
    return true;
    if(s.contains(sum- root.Key))
    return true;
    else
    s.add(root.Key);
    return isPairSum(root.right, sum, s);
  }
  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(8);
    root.right = new Node(20);
    root.right.left = new Node(11);
    root.right.right = new Node(30);
    root.right.right.left = new Node(25);
    root.left.left = new Node(4);
    root.left.right = new Node(9);
    int sum= 33;
    HashSet<Integer> s= new HashSet<Integer>();
    boolean p= isPairSum(root, sum, s);
    System.out.println(p);
}
}
