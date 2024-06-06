package Tree;
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
public class constructtree {
    static int preIndex=0;
    static Node cTree(int in[], int pre[], int is, int ie)
    {
        if(is>ie)
        return null;
        Node root= new Node(pre[preIndex++]);
        int inIndex=0;
        for(int i=is;i<= ie;i++)
        {
            if(in[i]== root.Key)
            {
                inIndex= i;
                break;
            }
        }
        root.left = cTree(in, pre, is, inIndex-1);
        root.right = cTree(in, pre,inIndex+1,ie);
        return root;
    }
    public static void printList(Node root) {
        if (root != null) {
            printList(root.left);
            System.out.print(root.Key + " ");
            printList(root.right);
        }
    }
    public static void main(String[] args) {
        int[] in= {20,10,40,30,50};
        int[] pre={10,20,30,40,50};
        int is=0;
        int ie=4;
        Node r= cTree(in,pre,is,ie);
        System.out.println(r.Key);

        printList(r);
    }
}
