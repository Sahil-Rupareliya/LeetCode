package Stack;

import java.util.Stack;

public class LeetCode1693 {
    public static void main(String[] args) {
        String s =  "]][]][][[[";
        System.out.println(minSwaps(s));
    }

    public static int minSwaps(String s) {
        Stack<Character> stack = new Stack();
        for(char i : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                if(i==']'){
                    if (stack.peek() == '['){
                        stack.pop();
                    }else{
                        stack.push(i);
                    }
                }else{
                    stack.push(i);
                }
            }
        }
        System.out.println(stack);
        int ans = 0;
        if(stack.size() % 4 ==0){
            ans = (stack.size()/4);
        }else{
            ans = (stack.size()/4)+1;
        }
        return ans;
    }
}
