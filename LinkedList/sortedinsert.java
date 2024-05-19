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
public class sortedinsert {
    static Node sortedInsert(Node head, int x)
    {
        Node temp= new Node(x);
        if(head== null)
        return temp;
        if(x<head.data)
        {
            temp.next= head;
            return temp;
        }
        else{
            Node curr= head;
            while(curr.next!= null&& curr.next.data<x)
            {
                curr= curr.next;
            }
            temp.next= curr.next;
            curr.next= temp;
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
    }
    public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= new Node(40);
        head.next.next.next.next= new Node(50);
        int x= 25;
        head= sortedInsert(head,x);
        printList(head);
}
}
