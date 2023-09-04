package HashMap;

import java.util.*;

public class LeetCode2506 {
    public static void main(String[] args) {
        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        HashMap<Set<Character>, Integer> hm = new HashMap<>();
        for(String s: words){
            Set<Character> set = new HashSet<>();
            for(char ch: s.toCharArray()){
                set.add(ch);
            }
            hm.put(set, hm.getOrDefault(set,0)+1);
        }

        int ans =0;
        for(int i: hm.values()){
            ans += i*(i-1)/2;
        }
        return ans;
    }
}
