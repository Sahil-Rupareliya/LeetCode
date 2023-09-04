package Stack;

import java.util.Stack;

public class Leetcode844 {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 =new Stack<>();
        Stack<Character> stack2 =new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }else{
                stack1.push(s.charAt(i));
            }
        }

        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#'){
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }else{
                stack2.push(t.charAt(i));
            }
        }

        return stack1.equals(stack2);
    }
}
