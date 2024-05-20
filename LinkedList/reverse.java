package LinkedList;

//import java.util.ArrayList;

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
public class reverse {
 //   static Node reverseList(Node head)
 //   {
 //       ArrayList <Integer> arr= new ArrayList <Integer>();
 //       for(Node curr= head;curr!= null;curr= curr.next)
 //       {
 //           arr.add(curr.data);
 //       }
 //       for(Node curr= head;curr!= null;curr= curr.next)
 //       {
 //           curr.data= arr.remove(arr.size()-1);
 //       }
 //       return head;
 //   }
 //efficient solution
     static Node reverseList(Node head)
     {
        Node curr= head;
        Node prev= null;
        while(curr!= null)
        {
            Node next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return prev;
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
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        
        head= reverseList(head);
        printList(head);
}
}
