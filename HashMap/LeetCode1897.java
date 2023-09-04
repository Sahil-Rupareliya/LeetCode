package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1897 {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> hm = new HashMap<>();

        for(String s : words){
            for(char ch : s.toCharArray()){
                hm.put(ch, hm.getOrDefault(ch,0)+1);
            }
        }
        int size = words.length;
        for(char ch: hm.keySet()){
            if(hm.get(ch) != size){
                return false;
            }
        }
        return true;
    }
}
