package Stack;

import java.util.Stack;

public class LeetCode1190 {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
        String temp = s.substring(1,s.length()-2);
    }

    public static String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ')'){
                stack.push(ch);
            }else{
                StringBuilder temp=  new StringBuilder();
                while (stack.peek() != '('){
                    temp.append(stack.pop());
                }
                stack.pop();
                for(int j=0; j<temp.length(); j++){
                    stack.push(temp.charAt(j));
                }
            }
        }


        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
