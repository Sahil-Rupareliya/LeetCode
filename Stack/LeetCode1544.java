package Stack;

import java.util.Stack;

public class LeetCode1544 {
    public static void main(String[] args) {
        String s = "abBAcC";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == stack.peek()+32 || s.charAt(i) == stack.peek()-32){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
