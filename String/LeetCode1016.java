package String;

public class LeetCode1016 {
    public static void main(String[] args) {
        String s = "0110"; int n = 4;
        System.out.println(queryString(s,n));
    }

    public static boolean queryString(String s, int n) {
        for(int i=2; i<=n; i++){
            String temp =Integer.toBinaryString(i);
            System.out.println(temp);
            if(!(s.contains(temp))) {
                return false;
            }
        }
        return true;
    }
}
