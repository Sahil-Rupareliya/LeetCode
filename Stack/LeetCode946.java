package Stack;

import java.util.Stack;

public class LeetCode946 {
    public static void main(String[] args) {
        int[] pushed = {2,1,0}, popped = {1,2,0};//1 2 3 4 5   4 5 3 2 1
        System.out.println(validateStackSequences(pushed,popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack1 = new Stack<>();
        int pointer = 0;
        for(int i=0; i<pushed.length; i++){
            int temp = pushed[i];
            if(stack1.isEmpty()){
                if(temp == popped[pointer]){
                    pointer++;
                }else{
                    stack1.push(temp);
                    continue;
                }
            }else{
                if(temp == popped[pointer]){
                    pointer++;
                }else{
                    stack1.push(temp);
                }
                while (!stack1.empty() && stack1.peek() == popped[pointer]){
                    pointer++;
                    stack1.pop();
                }
            }
        }
//        while (!stack1.isEmpty()){
//            if(stack1.peek() != popped[pointer]){
//                return false;
//            }else{
//                stack1.pop();
//                pointer++;
//            }
//        }

        return stack1.isEmpty();
    }
}
