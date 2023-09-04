package HashMap;
import java.util.*;

public class LeetCode290 {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)return false;
        HashMap<Character, String> hm = new HashMap<>();
        int idx = 0;
        for(char ch : pattern.toCharArray()){
            if(hm.containsKey(ch)){
                if(!arr[idx].equals(hm.get(ch))){
                    return false;
                }
                idx++;
            }else if(hm.containsValue(arr[idx])){
                return false;
            }else{
                hm.put(ch,arr[idx++]);
            }
        }
        return true;
    }
}
