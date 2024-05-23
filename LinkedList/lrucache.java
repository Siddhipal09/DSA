package LinkedList;


import java.util.HashMap;

class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0); // Dummy head
        this.tail = new Node(0, 0); // Dummy tail
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            insertToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            insertToHead(node);
        } else {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertToHead(newNode);
        }
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public void printCache() {
        Node curr = head.next;
        while (curr != tail) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(4);

        // Reference sequence: 10, 20, 10, 30, 40, 50, 30, 40, 60, 30
        cache.put(10, 10);
        cache.printCache(); // Expected: 10
        cache.put(20, 20);
        cache.printCache(); // Expected: 20 10
        cache.get(10); // Access 10
        cache.printCache(); // Expected: 10 20
        cache.put(30, 30);
        cache.printCache(); // Expected: 30 10 20
        cache.put(40, 40);
        cache.printCache(); // Expected: 40 30 10 20
        cache.put(50, 50); // Cache full, evicts 20
        cache.printCache(); // Expected: 50 40 30 10
        cache.get(30); // Access 30
        cache.printCache(); // Expected: 30 50 40 10
        cache.get(40); // Access 40
        cache.printCache(); // Expected: 40 30 50 10
        cache.put(60, 60); // Cache full, evicts 10
        cache.printCache(); // Expected: 60 40 30 50
        cache.get(30); // Access 30
        cache.printCache(); // Expected: 30 60 40 50
    }
}

