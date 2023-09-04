package String;

public class LeetCode2185 {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int len = pref.length();
        int count =0;
        for(int i=0; i<words.length; i++){
            if(isPrefix(words[i],len,pref)){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrefix(String word, int len, String pref) {
        for (int i = 0; i <len; i++) {
            if(word.charAt(i) != pref.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
