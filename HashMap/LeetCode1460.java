package HashMap;

import java.util.*;

public class LeetCode1460 {
    public static void main(String[] args) {
        int[] target = {1,2,3,4}, arr = {2,4,1,3};
        System.out.println(canBeEqual(target,arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> map = new HashMap();
        for(int i: target){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i:arr){
            if(map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
                if(map.get(i) == 0)map.remove(i);
            }
        }
        return map.isEmpty();
    }
}
