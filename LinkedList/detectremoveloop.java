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
public class detectremoveloop {
    static void detectRemoveloop(Node head)
    {
        Node slow= head;
        Node fast= head;
        while(fast!= null&& fast.next!= null)
        {
            slow= slow.next;
            fast= fast.next.next;
            if(slow== fast)
            break;
        }
        if(slow!= fast)
        return;
        slow= head;
        while(slow.next!= fast.next)
        {
            slow= slow.next;
            fast= fast.next;
        }
        fast.next= null;
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
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(12);
        head.next.next.next = new Node(20);
        head.next.next.next.next = head.next;
       
        detectRemoveloop(head);
        printList(head);
    
}
}
