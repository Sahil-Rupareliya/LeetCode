package HashMap;

import java.util.*;

public class LeetCode1935 {
    public static void main(String[] args) {
        String text = "hello world", brokenLetters = "ad";
        System.out.println(canBeTypedWords(text,brokenLetters));

    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(char ch :brokenLetters.toCharArray())set.add(ch);


        for(String temp : text.split(" ")){
            if(isContains(temp, set))count++;
        }
        return count;
    }

    public static boolean isContains(String s, Set<Character> set){
        for(char ch : s.toCharArray()){
            if(set.contains(ch))return false;
        }
        return true;
    }
}
