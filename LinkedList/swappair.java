package LinkedList;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class swappair {
    static Node pairSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        head = curr.next; // The new head will be the second node

        while (curr != null && curr.next != null) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = curr;
            if (prev != null) {
                prev.next = next;
            }
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);

        head = pairSwap(head);
        printList(head);
    }
}
