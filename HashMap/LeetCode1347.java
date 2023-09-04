package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1347 {
    public static void main(String[] args) {
        String s = "bab", t = "aba";
        System.out.println(minSteps(s,t));
    }

    public static int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0)map.remove(ch);
            }
        }

        for(char ch: map.keySet()){
            ans += map.get(ch);
        }
        return ans;
    }
}
