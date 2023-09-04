package Queue;

//QUEUE USING ARRAY.
// Simple Queue using Array.
/*
public class Main {
    static int[] queue = new int[2];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {
        add(5);
        add(6);
        remove();
        remove();
        add(7);
        print();
    }

    public static void add(int value){
        if(rear == queue.length-1){
            System.out.println("Queue is full");
            return;
        }

        queue[++rear] = value;
    }

    public static void remove(){
        if(front == rear){
            System.out.println("Queue is empty");
            return;
        }

        front++;
        if(front == rear){
            front = rear = -1;
        }
    }

    public static void print(){
        for(int i=front+1; i<=rear; i++){
            System.out.print(queue[i] + " ");
        }
    }


}
*/

//Circular queue using Array

public class UserDefineUsingArray {
    static int rear =-1;
    static  int front = -1;
    static  int size = 3;
    static int[] CircularQueue = new int[size];

    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        remove();
        add(4);
        System.out.println("Peek element is : "+ peek());
        remove();
        add(5);;
        remove();
        remove();
        remove();
        System.out.println(front);
        System.out.println(rear);
    }

    public static void add(int value){
        if((isFull())){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front = 0;
        }
        rear = (rear+1)%size;
        CircularQueue[rear] = value;
//        System.out.println("Added : " + value);
    }

    public static void remove(){
        if(isempty()){
            System.out.println("Queue is empty");
            return;
        }

        int temp = CircularQueue[front];
        if(rear == front){
            rear = front = -1;
        }else {
            front = (front+1)% size;
        }
        System.out.println("Removed : " + temp);
    }

    public static int peek(){
        if(isempty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return CircularQueue[front];
    }


    public static boolean isempty(){
        return front==-1 || rear==-1;
    }

    public static boolean isFull(){
        return (rear+1)%size == front;
        //if(rear+1 != size) {
//        return rear + 1 == front;
//        }
//        return rear== size-1 && front==0;
    }
}

