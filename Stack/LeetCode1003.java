package Stack;

import java.util.Stack;

public class LeetCode1003 {
    public static void main(String[] args) {
        String s = "aaababccbcbc";
        System.out.println(isValid(s));
        }

    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
////        stack2.push(1);
//        int count =1;
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(stack.isEmpty()){
//                stack2.push(1);
//                stack.push(ch);
//                count = 1;
//            }else{
//                if(stack.peek()+1 == ch){
//                    count++;
//                    stack.push(ch);
//                    int a = stack2.pop()+1;
//                    stack2.push(a);
//                    if(count == 3){
//                        while (count-->0){
//                            stack.pop();
//                        }
//                        stack2.pop();
//                        count = (stack2.isEmpty()) ? 0 : stack2.peek();
//                    }
//                }else{
//                    stack2.push(1);
//                    stack.push(ch);
//                    count = 1;
//                }
//            }
//        }
//        return stack.isEmpty();
        char[] cs = s.toCharArray();
        int i = 0;
        for (char c : cs) {
            if (c != 'a' && (i == 0 || c != cs[--i] + 1)) {
                return false;
            }
            if (c != 'c') {
                cs[i++] = c;
            }
        }
        return i == 0;

    }
}
