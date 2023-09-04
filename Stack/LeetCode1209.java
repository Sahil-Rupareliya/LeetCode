package Stack;

import java.util.Stack;

public class LeetCode1209 {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s,k));
    }

    public static String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
//        stack2.push(1);
        int count =1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack2.push(1);
                stack.push(ch);
                count = 1;
            }else{
                if(stack.peek() == ch){
                    count++;
                    stack.push(ch);
                    int a = stack2.pop()+1;
                    stack2.push(a);
                    if(count == k){
                        while (count-->0){
                            stack.pop();
                        }
                        stack2.pop();
                        count = (stack2.isEmpty()) ? 0 : stack2.peek();
                    }
                }else{
                    stack2.push(1);
                    stack.push(ch);
                    count = 1;
                }
            }
        }
        return stack.toString();
    }
}
