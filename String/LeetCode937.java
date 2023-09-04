package String;

import java.util.Arrays;

public class LeetCode937 {
    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
    }

    public static String[] reorderLogFiles(String[] logs) {
        int dig_Pointer = 0;
        Arrays.sort(logs);
        return logs;
    }
}
