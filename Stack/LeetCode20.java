package Stack;

import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
       String  s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.empty())return false;
                if(s.charAt(i)==')' && stack.peek()=='(' || s.charAt(i)=='}' && stack.peek()=='{' ||s.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
