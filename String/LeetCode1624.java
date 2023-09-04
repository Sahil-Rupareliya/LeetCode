package String;

public class LeetCode1624 {
    public static void main(String[] args) {
        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = s.lastIndexOf(ch);
            if(idx != -1 && idx != i){
                max = Math.max(max,idx-i-1);
            }
        }
        return max;
    }


}
