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
public class detectloop {
   static boolean isloop(Node head)
    {
        Node temp= new Node(0);
        Node curr= head;
        while(curr!= null)
        {
            if(curr.next==null)
            return false;
            if(curr.next==temp)
            return true;
            Node curr_next= curr.next;
            curr.next= temp;
            curr= curr_next;
        }
        return false;
    }
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);

        // Creating a loop for testing: 20 -> 15
        head.next.next.next.next = head.next;

        if (isloop(head)) {
            System.out.println("Loop detected");
        } else {
            System.out.println("No loop detected");
        }
    }
}
