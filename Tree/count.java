package Tree;

public class count {
 //   static int countNode(Node root)
 //   {
 //       if(root== null)
 //       return 0;
 //       else{
 //           return(1+ countNode(root.left)+countNode(root.right));
 //       }
 //   }
 // efficient solution
    static double countNode(Node root)
    {
        int lh=0;
        int rh= 0;
        Node curr= root;
        while(curr!= null)
        {
            lh++;
            curr= curr.left;
        }
         curr= root;
        while(curr!= null)
        {
            rh++;
            curr= curr.right;
        }
        if(lh== rh)
        return (Math.pow(2, lh)-1);
        return (1+ countNode(root.left)+countNode(root.right));
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        double count= countNode(root);
        //int count= countNode(root);
        System.out.println(count);
}
}