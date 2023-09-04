package HashMap;
import java.util.*;


public class LeetCode2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }

    public static String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s: arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        for(String s:arr){
            if(map.get(s) == 1)k--;
            if(k ==0)return s;
        }
        return " ";
    }
}
