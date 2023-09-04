package String;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode387 {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for(char i: s.toCharArray()){
            arr[i-'a']++;
            queue.offer(i);
        }

        while(!queue.isEmpty() && arr[queue.peek()-'a'] > 1){
            queue.remove();
        }

        if(queue.isEmpty()){
            return -1;
        }
        return s.indexOf(queue.peek());
    }
}
