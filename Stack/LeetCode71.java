package Stack;

import java.util.Stack;

public class LeetCode71 {
    public static void main(String[] args) {
        String path = "/abc/...";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] str  =path.split("/");
        for(int i=0; i<str.length; i++){
            String temp = str[i];
            if(temp.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(temp.length()!= 0 && !temp.equals(".")){
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()){
            sb.insert(0,"/" + stack.pop());
        }

        return sb.toString();
    }
}
