package Queue;

import java.nio.file.StandardWatchEventKinds;
import java.util.Stack;


// Simple Queue using LinkedList
public class UserDefineUsingLL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
//        queue.print();
        queue.remove();
        queue.print();
        queue.peek();

    }



    static  class Queue{
        static Node head;
        static Node tail;

        void add(int value){
            Node n1 = new Node(value);
            if(head == null){
                head = n1;
                tail = head;
                return;
            }

            tail.next = n1;
            tail = n1;
        }
        void remove(){
            if(head == null){
                return;
            }

            head = head.next;
        }

        void peek(){
            if(head == null){
                System.out.println("Queue is empty");
                return;
            }

            System.out.println("Peek element is " + head.value);
        }

        void print(){
            Node temp = head;
            System.out.print("Queue element is : ");
            while (temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }


        class Node{
            private int value;
            private Node next;

            public Node(int value) {
                this.value = value;
            }
        }
    }
}

