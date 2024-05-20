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
public class nodefromend {
//   static void printNthfromEnd(Node head,int n)
//   {
//    int len=0;
//    for(Node curr= head;curr!= null;curr=curr.next)
//    {
//        len++;
//    }
//    if(len<n)
//    return;
//    Node curr= head;
//    for(int i=1;i<len-n+1;i++)
//    curr= curr.next;
//    System.out.println(curr.data);
//  }
// method 2
 static void printNthfromEnd(Node head, int n)
 {
    if(head==null)
    return;
    Node first= head;
    for(int i=0;i<n;i++)
    {
        if(first==null)
        return;
        first=first.next;
    }
    Node second= head;
    while(first!= null)
    {
        second=second.next;
        first= first.next;
    }
    System.out.println(second.data);
 }
   public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        int n=2;
        printNthfromEnd(head,n);
}
}
