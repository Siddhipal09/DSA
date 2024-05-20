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
public class middle {
  //  static void middleNode(Node head)
  //  {
  //      if(head== null)
  //        return;
  //        int count=0;
  //        Node curr;
  //        for( curr=head;curr!=null;curr=curr.next)
  //        {
  //          count++;

  //        }
  //        curr= head;
  //        for(int i=0;i<count/2;i++)
  //        {
  //          curr= curr.next;
  //        }
  //        System.out.println(curr.data);
  //  }
  //efficient solution
  static void middleNode(Node head)
  {
    if(head== null)
    {
        return;
    }
    Node slow= head;
    Node fast= head;
    while(fast!= null&&fast.next!= null)
    {
        slow= slow.next;
        fast=fast.next.next;
    }
    System.out.println(slow.data);
  }
    public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        head.next.next.next.next.next= new Node(60);
        middleNode(head);
    }
}

