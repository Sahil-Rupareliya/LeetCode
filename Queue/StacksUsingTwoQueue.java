package Queue;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StacksUsingTwoQueue {

    public static class Stacks{
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();

        public void push(int value){
            if(queue1.isEmpty()){
                queue1.add(value);
                return;
            }

            queue2.add(value);
            while (!queue1.isEmpty()){
                queue2.add(queue1.remove());
            }

            while (!queue2.isEmpty()){
                queue1.add(queue2.remove());
            }
        }

        public void pop(){
            if(queue1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(queue1.peek());
            queue1.remove();
        }

        public void peek(){
            if(queue1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }

            System.out.println(queue1.element());
        }

        public boolean isEmpty(){
            if(queue1.isEmpty()){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks();
        stack.push(10);
        stack.push(20);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        System.out.println(stack.isEmpty());

        List<Integer> list = new ArrayList<>();

    }
}
