import java.util.HashMap;

public class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // Output: 1
        cache.put(3, 3);
        System.out.println(cache.get(2)); // Output: -1
        cache.put(4, 4);
        System.out.println(cache.get(1)); // Output: -1
        System.out.println(cache.get(3)); // Output: 3
        System.out.println(cache.get(4)); // Output: 4    }
        
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToTail(node);
            return node.data;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.data = value;
            moveToTail(node);
        } else {
            if (map.size() >= capacity) {
                Node lruNode = removeLRUNode();
                map.remove(lruNode.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToTail(newNode);
        }
    }

    private void moveToTail(Node node) {
        removeNode(node);
        addToTail(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToTail(Node node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    private Node removeLRUNode() {
        Node lruNode = head.next;
        removeNode(lruNode);
        return lruNode;
    }

    class Node {
        int key, data;
        Node prev, next;

        public Node(int key, int data) {
            this.key = key;
            this.data = data;
        }

        public Node(int data) {
            this.data = data;
        }
    }

}