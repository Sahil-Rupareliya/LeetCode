package String;

public class LeetCode2255 {
    public static void main(String[] args) {
        String[] words = {"a","a"};
        String s = "aa";
        System.out.println(countPrefixes(words,s));
    }

    public static int countPrefixes(String[] words, String s) {
        int ans=  0;
        for(int i=0; i<words.length; i++){
            if(s.startsWith(words[i])){
                ans++;
            }
        }
        return ans;
    }
}
