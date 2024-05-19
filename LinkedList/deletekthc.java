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
public class deletekthc {
    static Node deleteKth(Node head, int k)
    {
       if(head== null)
       return null;
       if(k==1)
       return delHead(head);
       else{
        Node curr= head;
        for(int i=0;i<k-2;i++)
        {
            curr= curr.next;
        }
        curr.next=curr.next.next;
        return head;
       }   
    }
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
        head.next.next.next= new Node(40);
        head.next.next.next.next= head;
        int k=3;
        head= deleteKth(head,k);
        printList(head);

    }
    
}



