package String;

import java.util.Arrays;

public class LeetCode2042 {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }

    public static boolean areNumbersAscending(String s) {
        String[]  ch = s.split(" ");
        int prev = -1;
        for(String temp : ch){
            try {
                int number = Integer.parseInt(temp);
                if (number < prev){
                    return false;
                }
                prev = number;
            }
            catch (Exception e){}
        }
        return true;
    }
}
