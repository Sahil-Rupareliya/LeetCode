package LinkedList;

import org.w3c.dom.Node;

import java.util.HashMap;

//public class LL {
//
//    private Node Head;
//    private Node Tail;
//    private int size;
//
//    public LL(){
//        this.size = 0;
//    }
//
//    public void insertFirst(int value){
//        Node node = new Node(value);
//        node.next = Head;
//        Head = node;
//
//        if(Tail == null){
//            Tail = Head;
//        }
//        size+=1;
//    }
//
//    public void deleteFirst(){
//        Node Temp = Head.next;
//        Head = Temp;
//        size -= 1;
//    }
//
//    public void deleteLast(){
//
//    }
//
//    public void insertLast(int value){
//        Node node = new Node(value);
//        Tail.next = node;
//        node = Tail;
//        size+=1;
//    }
//
//    public void Display(){
//        Node temp = Head;
//        while (temp != null){
//            System.out.print(temp.value + "->");
//            temp = temp.next;
//        }
//        System.out.println("END");
//    }
//
//    private class Node{
//        private int value;
//        private Node next;
//
//
//        public Node(int value) {
//            this.value = value;
//        }
//
//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
//
//    }
//}

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node n1 = new Node(value);
        n1.next = head;
        head = n1;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node n1 = new Node(value);
        tail.next = n1;
        n1 = tail;
        size += 1;
    }

    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
    }

    public void deleteLast(){
        if (size <=1){
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next != tail.next){
            temp = temp.next;
        }
        temp.next = null;
        size -=1;
    }
    public void insertAtIndex(int index,int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node prev = head;
        for(int i=1; i<index ; i++){
            prev = prev.next;
        }
        Node n1 = new Node(value,prev.next);
        prev.next = n1;

        size += 1;
    }

    public  void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node temp = nThNode(index-1);
        temp.next = temp.next.next;
        size -=1;
    }



    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp= temp.next;
        }
        System.out.println("END");
    }

    public Node nThNode(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node Find(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }

    public void reverseList(){
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public boolean isPalindrome(){
        if (head == null || head.next == null){
            return true;
        }
        Node mid = midIndex();

        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null){
            if (left.value != right.value){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node midIndex(){
        Node slow  = head;
        Node fast  = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    private class Node{
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

}