package LinkeListAddZero;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    void insertFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = head;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    void insertLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            insertFirst(value);
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    void insertAt(int index, int value) {
        if (index > size) {
            System.out.println("Index Not Fount");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = findNthNode(index);
        temp.next = new Node(value, temp.next);
        size++;

    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("No element to delete");
            return;
        }

        if (head == tail) {
            head = null;
            tail = head;
            size--;
            return;
        }

        head = head.next;
        size--;
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("No element to delete");
            return;
        }

        if (head == tail) {
            removeFirst();
            return;
        }

        Node temp = findNthNode(size - 1);
        tail = temp;
        tail.next = null;
        size--;
    }

    void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("No element to delete");
            return;
        }

        if (index > size) {
            System.out.println("Index Not Exists");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node temp = findNthNode(index);
        temp.next = temp.next.next;
        size--;

    }

    void removeValue(int value) {
        if (head == null) return;
        if (head.value == value) {
            removeFirst();
            return;
        }

        Node temp = head;
        {
            while (temp.next != null) {
                if (temp.next.value == value) {
                    if (temp.next == tail) {
                        tail = temp;
                        temp.next = null;
                        return;
                    }
                    temp.next = temp.next.next;
                    size--;
                }
                temp = temp.next;
            }
        }

    }

    boolean findValue(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    void update(int oldVal, int newVal) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == oldVal) {
                temp.value = newVal;
            }
            temp = temp.next;
        }
    }


    boolean isEmpty() {
        return head == null;
    }


    //   2. Count nodes / length of linked list
    void Count_Node() {
        System.out.println(size);
    }

    //    3. Print linked list in reverse
    void reverseLinkedList() {
        Node temp = head;
        tail = temp;
        Node prev = null;
        Node next;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        print();
    }

    //  4. Get nth node in linked list
    private Node findNthNode(int i) {
        Node temp = head;
        while (i-- > 1) {
            temp = temp.next;
        }
        return temp;
    }


    //  5. Get nth node from end in linked linked list
    private Node findNthNodeFromLast(int i) {
        Node temp = head;
        int temp2 = size - i;
        while (temp2-- > 0) {
            temp = temp.next;
        }
        return temp;
    }

//  6. Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? (head not given)

    void DeleteNodeWithoutHead(Node delete) {
        delete.value = delete.next.value;
        delete.next = delete.next.next;
    }
}
