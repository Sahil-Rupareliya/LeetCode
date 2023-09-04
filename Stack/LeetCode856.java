package Stack;

import java.util.Stack;

public class LeetCode856 {
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(scoreOfParentheses(s));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Character> stack =  new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }else{
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    stack.push('1');
                }else{
                    int sum = 0;
                    while(!stack.empty() && stack.peek() != '('){
                        sum += stack.pop()-'0';
                    }
                    stack.pop();
                    stack.push((char)(2*sum + '0'));
                }
            }
        }
        int sum = 0;
        while(!stack.empty()){
            sum += (stack.pop()-'0');
        }
        return sum;
    }
}