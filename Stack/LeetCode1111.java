package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode1111 {
    public static void main(String[] args) {
        String seq = "(()())";
        System.out.println(Arrays.toString(maxDepthAfterSplit(seq)));
    }

    public static int[] maxDepthAfterSplit(String seq) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        int[] arr = new int[seq.length()];
        for(int i=0; i<seq.length(); i++){
            if(seq.charAt(i) == '('){
                if(stack.size() <= stack2.size()){
                    stack.push('(');
                    arr[i] = 0;
                }else{
                    stack2.push('(');
                    arr[i] = 1;
                }
            }else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    arr[i] = 0;
                }else{
                    stack2.pop();
                    arr[i] = 1;
                }
            }
        }
        return arr;
    }
}
