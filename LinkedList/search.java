package LinkedList;
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next= null;
    }
}
public class search {
    public static void searchNode(Node head,int x)
    {
        int pos=1;
        Node curr= head;
        while(curr!= null)
        {
            if(curr.data==x)
            {
                System.out.print(pos);
                return;
            }
            else
            {
                pos++;
                curr=curr.next;
            }
        }
        System.out.println("-1");
    }
    public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        int x= 40;
        searchNode(head,x);
}
}
