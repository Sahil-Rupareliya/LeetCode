package HashMap;

import javax.security.auth.callback.CallbackHandler;
import java.util.*;

public class LeetCode890 {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words,pattern));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        if(pattern.length() == 1)return Arrays.asList(words);
        List<String> ans = new ArrayList<>();

        for(String s: words){
            if(isReplace(s,pattern))ans.add(s);
        }
        return ans;
    }

    public static boolean isReplace(String s, String pattern){
        Map<Character, Character> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char value = s.charAt(i);
            char key = pattern.charAt(i);
            if(hm.containsKey(key)){
                if(hm.get(key) != value)return false;
            }else if(hm.containsValue(value)){
                return false;
            }else{
                hm.put(key,value);
            }
        }
        return true;
    }
}
