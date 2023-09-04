package String;

public class LeetCode1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int count = 0;
        for(int i=0; i<s.length()-2; i++){
            char s1 = s.charAt(i);
            char s2 = s.charAt(i+1);
            char s3 = s.charAt(i+2);
            if(s1 != s2 && s1 !=s3 && s2 != s3){
                count++;
            }
        }
        System.out.println(count);
    }

}
