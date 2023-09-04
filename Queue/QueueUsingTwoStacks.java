package Queue;

import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingTwoStacks {


    public static void main(String[] args) {
        Queues queue = new Queues();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.remove();
//        queue.print();
        queue.peek();

    }

    public static class Queues{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void print(){
            if(stack1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            while (!stack1.isEmpty()){
                System.out.println(stack1.pop());
            }
        }

        public void add(int value){
            if(stack1.isEmpty()) {
                stack1.push(value);
                return;
            }

            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(value);
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        public void remove(){
            if(stack1.empty()){
                System.out.println("Queue is empty");
                return;
            }
            stack1.pop();
//            System.out.println(stack1.pop());
        }

        public void peek(){
            if(stack1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(stack1.peek());
        }
    }
}
