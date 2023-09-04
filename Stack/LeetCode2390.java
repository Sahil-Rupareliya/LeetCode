package Stack;

import java.util.Stack;

public class LeetCode2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack s1 = new Stack();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                s1.pop();
            }else{
                s1.push(s.charAt(i));
            }
        }
        while (!s1.empty()){
            sb.append(s1.pop());
        }
        return sb.reverse().toString();
//        int idx = 0;
//        byte[] arr = s.getBytes();
//        byte[] ans = new byte[s.length()];
//        for(byte i: arr){
//            if(i == '*'){
//                idx--;
//            }else{
//                ans[idx++] = i;
//            }
//        }
//        return new String(ans,0,idx);
    }
}
