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
public class sortedmerge {
    static Node sortedMerge(Node a, Node b)
    {
        if(a== null)
        return b;
        if(b== null)
        return a;
        Node head= null;
        Node tail= null;
        if(a.data< b.data)
        {
            head= tail= a;
            a= a.next;
        }
        else{
            head= tail= b;
            b= b.next;
        }
        while(a!= null&& b!= null)
        {
            if(a.data<= b.data)
            {
                tail.next= a;
                tail= a;
                a= a.next;
            }
            else{
                tail.next= b;
                tail= b;
                b= b.next;
            }
        }
        if(a== null)
        tail.next= b;
         else
         tail.next= a;
         printList(head);
      return head;
    }
    public static void printList(Node head)
    {
        Node curr= head;
        while(curr!= null)
        {
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.println(" ");
    }
    public static void main (String args[])
    {
        Node a= new Node(10);
        a.next= new Node(20);
        a.next.next= new Node(30);
        a.next.next.next= new Node(40);
        a.next.next.next.next= new Node(50);

        Node b= new Node(5);
        b.next= new Node(15);
        b.next.next= new Node(17);
        b.next.next.next= new Node(18);
        b.next.next.next.next= new Node(35);
        sortedMerge(a, b);
       
       
}
}
