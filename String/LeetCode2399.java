package String;
import java.util.*;

public class LeetCode2399 {
    public static void main(String[] args) {
        String s = "aa";
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s,distance));
    }

    public static boolean checkDistances(String s, int[] distance) {
        Set<Character> set  = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                int idx = 1+i + distance[ch-'a'];
                if(idx >= s.length())return false;
                if(s.charAt(idx) != ch){
                    return false;
                }
            }
        }
        return true;
    }
}
