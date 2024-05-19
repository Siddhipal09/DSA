package DoublyLinkedList;
class Node{
int data;
Node next;
Node prev;
Node(int d)
{
    data= d;
    next= null;
    prev= null;
}
}
public class deletefirstdll {
    static Node deleteHead(Node head)
    {
        if(head== null)
        return null;
        if(head.next== null)
        return null;
        else{
            head= head.next;
            head.prev= null;
            return head;
        }
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
    public static void main(String args[])
    {
        Node head= new Node(10);
        Node temp1= new Node(20);
        Node temp2= new Node(30);
         head.next= temp1;
         temp1.prev= head;
         temp1.next=temp2;
         temp2.prev= temp1;
         head= deleteHead(head);
         printList(head);
         
    

    }
    
}
