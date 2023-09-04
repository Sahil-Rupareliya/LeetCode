package Stack;

import java.util.Stack;

public class LeetCode682 {
    public static void main(String[] args) {
        String[] ops = {"1","C"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0; i< operations.length; i++){
                if(operations[i].equals("C")){
                    sum -= stack.peek();
                    stack.pop();
                }else if(operations[i].equals("D")){
                    stack.push(stack.peek()*2);
                    sum += stack.peek();
                }else if(operations[i].equals("+")){
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b);
                    stack.push(a);
                    stack.push(a + b);
                    sum += stack.peek();
                }else{
                    stack.push(Integer.parseInt(operations[i]));
                    sum += stack.peek();
            }
        }
        return sum;
    }
}
