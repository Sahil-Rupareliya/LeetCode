//MinStack in O(n) constant space.

package Stack;

import java.util.Stack;

public class MinStackIn_O1_space {
    // A user defined stack that supports getMin() in
    // addition to push() and pop

    static Stack<Integer> stack = new Stack<>();
    static int minValue;


    public static void main(String[] args) {
        push(3);
        push(5);
        getMin();  // 3
        push(2);
        push(1);
        getMin(); // 1
        pop();
        getMin();
        pop();
        peek();
    }

    public static void push(int value){
        if(stack.empty()){
            stack.push(value);
            minValue = value;
            System.out.println("Inserted value is :" + value);
            return;
        }

        if(value > minValue){
            stack.push(value);
        }else{
            stack.push((2*value)-minValue);
            minValue = value;
        }
        System.out.println("Inserted value is : " + value);
    }


    public static void pop(){
        if(stack.empty()){
            System.out.println("Stack is empty");
            return;
        }

        if(stack.peek() < minValue){
            System.out.println("Popped value is :" + minValue);
            minValue = 2*minValue - stack.pop();
        }else{
            System.out.println("Popped value is : " + stack.pop());
        }
    }

    public static void peek(){
        if(stack.empty()){
            System.out.println("Stack is empty");
            return;
        }

        if(stack.peek() < minValue){
            System.out.println("peek value is :" + minValue);
//            minValue = 2*minValue - stack.pop();
        }else{
            System.out.println("Peek value is : " + stack.peek());
        }
    }

    public static void getMin(){
        if(stack.empty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Min Value is : " +minValue);
    }
}