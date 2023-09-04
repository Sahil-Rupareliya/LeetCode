package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode87 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for(char ch : s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
