package String;

public class LeetCode2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        int end = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        String ans = "";
        for(int i=end; i>=0; i--){
            ans += word.charAt(i);
        }
        for(int i=end+1; i<word.length(); i++){
            ans += word.charAt(i);
        }
        System.out.println(ans);
    }
}
