package Stack;

import java.util.Stack;

public class LeetCode880 {
    public static void main(String[] args) {
        String s = "ha22";
        int k = 5   ;
        System.out.println(decodeAtIndex(s,k));
    }

        public static String decodeAtIndex(String s, int k) {
            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
//            int len = 0;
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch >= '2' && ch <= '9'){
                    int a = ch -'0';
                    while(a--> 0){
                        int temp = k - sb.length();
                        if(temp > 0){
                            k -= sb.length();
                        }else{
                            return String.valueOf(sb.charAt(k-1));
                        }
                    }
                    if(s.charAt(i+1) >= '2' && s.charAt(i+1) <= '9'){
                        continue;
                    }else{
                        sb.setLength(0);
                    }

                }else{
                    sb.append(ch);
                }
            }
            return "";
        }
}
