package HashMap;

import java.util.HashSet;

public class LeetCode1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }

        for(String s : words){
            boolean b = true;
            for(char ch : s.toCharArray()){
                if(!set.contains(ch)){
                    b = false;
                    break;
                }
            }
            if(b){
                count++;
            }
        }
        return count;
    }
}
