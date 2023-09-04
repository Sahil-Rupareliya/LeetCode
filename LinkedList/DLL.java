package LinkedList;

public class DLL {
    private  Node head;
    private  Node tail;
    private  int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node n1 = new Node(val);
        n1.next = head;
        n1.prev = null;
        if(head != null){
            head.prev = n1;
        }
        head = n1;

    }

    public void insert_last(int val){
        Node n1 =new Node(val);
        tail.next = n1;
        n1.prev = tail;
        tail = n1;
    }

    public void insertLast(int value){
        Node n1  = new Node(value);
        Node temp = head;
        n1.next = null;
        if(head == null){
            n1.prev = null;
            head = n1;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = n1;
        n1.prev = temp;
    }

    public  void insertNthIndex(int value,int n){
        if(n == 0){
            insertFirst(value);
            return;
        }
        Node n1 = new Node(value);
        Node temp = nThNode(n-1);
        if(temp.next == null){
            insertLast(value);
            return;
        }
        n1.next = temp.next;
        n1.prev = temp;
        n1.next.prev = n1;
        temp.next = n1;
    }

    public Node nThNode(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp= temp.next;
        }
        System.out.println(temp.value);
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " " + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseDisplay(){
        Node temp = head;
        Node tail = null;
        while (temp != null){
            tail = temp;
            temp = temp.next;
        }
        while (tail != null){
            System.out.print(tail.value + " ->");
            tail = tail.prev;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
