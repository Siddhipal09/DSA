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
public class insertbeg {
    static Node insertBegin(Node head, int x)
    {
        Node temp= new Node(x);
        temp.next= head;
        return temp;
    }
    public static void printList(Node head)
    {
        Node curr= head;
        while(curr!= null)
        {
            System.out.print(curr.data+ " ");
            curr=curr.next;
        }
    }
    public static void main (String args[])
    {
        Node head= null;
        head= insertBegin(head,30);
        head= insertBegin(head,20);
        head= insertBegin(head,10);
        printList(head);

    }
    
}
