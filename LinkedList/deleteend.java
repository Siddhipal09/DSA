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
public class deleteend {
    static Node insertBegin(Node head, int x)
    {
        Node temp= new Node(x);
        temp.next= head;
        return temp;
    }
    static Node deleteEnd(Node head)
    {
      if(head== null)
      return null;
      if(head.next== null)
      return null;
      Node curr= head;
      while(curr.next.next!=null)
      {
        curr= curr.next;
      }
      curr.next= null;
      return head;
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
        head = deleteEnd(head);
        printList(head);

    }
}
    


