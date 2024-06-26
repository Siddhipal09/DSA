package Tree;

//import java.util.ArrayList;
class Node{
    int Key;
    Node left;
    Node right;

Node(int K)
{
    Key = K;
    left= right= null;
}
}
public class lowestcommonancestor {
 //   static boolean findPath(Node root, ArrayList<Node>p, int n)
 //   {
 //       if(root== null)
 //       return false;
 //       p.add(root);
 //       if(root.Key== n)
 //       return true;
 //       if(findPath(root.left,p,n)||findPath(root.right,p,n))
 //       return true;
 //       p.remove(p.size()-1);
 //       return false;
 //   }
 //   static Node lca(Node root, int n1, int n2)
 //   {
 //   ArrayList<Node> path1= new ArrayList<Node>();
 //   ArrayList<Node> path2= new ArrayList<Node>();
 //   if(findPath(root,path1,n1)==false||findPath(root,path2,n2)==false)
 //   return null;
 //   for(int i=0;i<path1.size()-1&&i<path2.size()-1;i++)
 //   {
 //       if(!path1.get(i+1).equals(path2.get(i+1)))
 //       return path1.get(i);
 //   }
 //    return null;
 //   }
 //efficient solution
     static Node lca(Node root, int n1, int n2)
     {
        if(root== null)
         return null;
        if(root.Key== n1|| root.Key== n2)
        return root;
        Node lca1= lca(root.left,n1,n2);
        Node lca2= lca(root.right,n1,n2);
        if(lca1!= null&& lca2!= null)
        return root;
        if(lca1!= null)
        return lca1;
        else 
        return lca2;
     }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.left = new Node(90);
        root.right.right.right = new Node(80);
        int n1=90;
        int n2= 80;
        Node ancestor= lca(root, n1,n2);
        System.out.println(ancestor.Key);
}
}
