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
public class insertendc {
    static Node insertEnd(Node head, int x)
          {
            Node temp= new Node(x);
             if(head==null)
             {
              temp.next= temp;
              return temp;
             }
             else{
                Node curr= head;
                while(curr.next!= head)
                {
                    curr= curr.next;
                }
                curr.next=temp;
                temp.next= head;
                return head;
             }
}
public static void printList(Node head)
    {
        if(head== null)
        return;
        System.out.print(head.data+" ");
        for(Node r= head.next; r!= head;r=r.next)
            System.out.print(r.data+ " ");
           
    }
    public static void main (String args[])
    {
        Node head= new Node(10);
        head.next= new Node(20);
        head.next.next= new Node(30);
        head.next.next.next= head;
        int x= 5;
       head= insertEnd(head,x);
        printList(head);

    }
    
}
