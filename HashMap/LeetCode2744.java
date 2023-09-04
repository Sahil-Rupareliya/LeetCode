package HashMap;

import java.util.HashSet;

public class LeetCode2744 {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();

        for(String s : words){
            if(s.charAt(0) == s.charAt(1))continue;
            set.add(s);
        }

        int count = 0;
        for(String s : words){
            StringBuilder sb = new StringBuilder(s);
            if(set.contains(sb.reverse().toString())){
                count++;
                set.remove(s);
                set.remove(sb.reverse().toString());
            }
        }
        return count;
    }
}
