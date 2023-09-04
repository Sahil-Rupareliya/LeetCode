package String;

public class LeetCode1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        String s = "";
        int len = word1.length();
        int len2 = word2.length();
        int i=0;
        int k =0;
        while(i < len && i < len2){
            s += word1.charAt(i);
            s += word2.charAt(i);
            i++;
        }

        while(len > i){
            s += word1.charAt(i);
            i++;
        }

        while(len2 > i){
            s += word2.charAt(i);
            i++;
        }
        System.out.println(s);
    }
}
