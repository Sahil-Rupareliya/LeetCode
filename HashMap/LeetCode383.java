package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode383 {
    public static void main(String[] args) {
        String ransomNote = "a", magazine = "b";
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch) == 0)hm.remove(ch);
            }else{
                return false;
            }
        }
        return true;
    }
}
