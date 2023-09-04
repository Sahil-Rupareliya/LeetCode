package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode2325 {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }


    public static String decodeMessage(String key, String message) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : key.toCharArray()){
            if(ch == ' '){
                continue;
            }else{
                hm.put(ch, temp++);
            }
        }

        System.out.println((Arrays.toString(hm.entrySet().toArray())));

        for(char ch : message.toCharArray()){
            if(ch == ' '){sb.append(' ');continue;}
            sb.append(hm.get(ch));
        }
        return sb.toString();
    }
}
