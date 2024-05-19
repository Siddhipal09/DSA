package LinkedList;
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class deletebegc {
//    static Node delHead(Node head)
//    {
//        if(head==null)
//        return null;
//        if(head.next== null)
//        return null;
//        else{
//            Node curr= head;
//            while(curr.next!=head)
//            curr= curr.next;
//            curr.next= head.next;
//            return curr.next;
//        }
//    }
//efficient solution
    static Node delHead(Node head)
    {
        if(head== null)
        return null;
        if(head.next== null)
        return null;
        else{
            head.data= head.next.data;
            head.next= head.next.next;
            return head;
        }
    }
    public static void printList(Node head)
    {
        if(head== null)
        return;
        System.out.print(head.data+" ");
        for(Node r= head.next; r!= head;r=r.next)
            System.out.print(r.data+ " ");
           
    }
    public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= head;
        
       head= delHead(head);
        printList(head);

    }
    
}

