package HashMap;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LeetCode748 {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[]words = {"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(licensePlate,words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        String ans = "";
        int maxSize= Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : licensePlate.toCharArray()){
            if(ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        loop:
        for(String s : words){
            Map<Character, Integer> temp = new HashMap<>();
            for(char ch : s.toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }

            for(char ch: map.keySet()){
                if(!temp.containsKey(ch)){
                    continue loop;
                }else if(temp.get(ch) < map.get(ch)){
                    continue loop;
                }
            }

            if(s.length() < maxSize){
                ans = s;
                maxSize = ans.length();
            }
        }
        return ans;
    }
}
