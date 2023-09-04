package String;

import java.util.Locale;

public class LeetCode520 {
    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        String temp = word.toLowerCase();
        String temp2 = word.toUpperCase();
        char[] arr = temp.toCharArray();
        arr[0] = (char)(arr[0] - 32);
        String temp3 = String.valueOf(arr);
        if(temp.equals(word)){
            return true;
        }else if(temp2.equals(word)){
            return true;
        }else if(temp3.equals(word)){
            return true;
        }
        return false;
    }
}
