package Stack;

import java.util.Stack;

public class LeetCode1249 {
    public static void main(String[] args) {
        String s = "lee(((t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }


    public static String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int open  = 0;
        int close = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ')' && ch!= '('){
                stack.push(ch);
            }else if(ch =='('){
                stack.push(ch);
                open++;
            }else if(ch == ')' && open > close){
                stack.push(ch);
                close++;
            }
        }
        while (!stack.empty()){
            if(stack.peek() == '(' && open > close){
                stack.pop();
                open--;
            }else{
                sb.append(stack.pop());
            }
        }
//        if(close < open){
//
//        }
//        System.out.println(stack);
        return sb.reverse().toString();
    }
}
