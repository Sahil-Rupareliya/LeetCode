package HashMap;

import java.util.HashMap;

public class LeetCode2068 {
    public static void main(String[] args) {
        String word1 = "aaaa", word2 = "bccb";
        System.out.println(checkAlmostEquivalent(word1,word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<word1.length(); i++){
            char ch = word1.charAt(i);
            char ch2 = word2.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
            hm.put(ch2, hm.getOrDefault(ch,0)-1);
        }

        for(char ch : hm.keySet()){
            if(Math.abs(hm.get(ch)) > 3){
                return false;
            }
        }
        return true;
    }
}
