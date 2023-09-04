package String;

public class LeetCode9 {
    public static void main(String[] args) {
        int x = 10;
        if(x < 0) System.out.println(false);
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        String s1 = new String(sb.reverse().toString());
        boolean ans = (s.equals(s1)) ? true : false;
        System.out.println(ans);
    }
}

