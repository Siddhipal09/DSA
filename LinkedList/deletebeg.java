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
public class deletebeg {

    static Node insertBegin(Node head, int x)
    {
        Node temp= new Node(x);
        temp.next= head;
        return temp;
    }

public static Node delHead(Node head)
{
    if(head==null)
    return null;
    else
    return head.next;
}
    

public static void printList(Node head)
    {
        Node curr= head;
        while(curr!= null)
        {
            System.out.print(curr.data+ " ");
            curr=curr.next;
        }
        System.out.println(" ");
    }
    public static void main (String args[])
    {
        Node head= null;
        head= insertBegin(head,30);
        head= insertBegin(head,20);
        head= insertBegin(head,10);
        printList(head);
        head = delHead(head);
        printList(head);

    }
}
    
