package LinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node n1 = new Node(val);
        if(head == null){
            head = n1;
            tail = n1;
            return;
        }
        tail.next = n1;
        n1.next = head;
        tail = n1;
    }

    public void findElement(int val){
        Node temp = head;
        if (head == null){
            return ;
        }

        if (tail.val == val){

        }
        if(temp.val == val){
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = temp.next;
            if (n.val == val){
                if(n == tail){

                }
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while (temp != head);
        System.out.println(head.val);
        System.out.println(tail.val);
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while (temp != head);
            System.out.println("END");
        }
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
