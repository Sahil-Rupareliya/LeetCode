package Stack;

import java.util.Stack;

public class LeetCode2696 {
    public static void main(String[] args) {
        String s = "D";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch :s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else if(!stack.empty() && ch == 'B' && stack.peek() == 'A' ||ch == 'D' && stack.peek() == 'C'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.size();

    }
}
