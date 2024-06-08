package Tree;
class Distance{
    int val;
    Distance(int d)
    {
        val = d;
    }
}
public class burn {
    static int res=0;
   static int burnTime(Node root, int leaf, Distance dist)
    {
        if(root== null)
        return 0;
        if(root.Key== leaf)
        {
            dist.val=0;
            return 1;
        }
        Distance ldist= new Distance(-1);
        Distance rdist= new Distance(-1);
        int lh= burnTime(root.left, leaf, ldist);
        int rh= burnTime(root.right, leaf, rdist);
        if(ldist.val!= -1)
        {
            dist.val= ldist.val+1;
            res= Math.max(res, rh+dist.val);
        }
       else if(rdist.val!= -1)
        {
            dist.val= rdist.val+1;
            res= Math.max(res, lh+dist.val);
        }
        return (Math.max(lh, rh)+1);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(60);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        int leaf= 50;
        Distance dist = new Distance(-1);
        int t= burnTime(root, leaf, dist);
        System.out.print(t);
}
}