package HashMap;

import java.util.*;

public class LeetCode2784 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3};
        System.out.println(isGood(nums));
    }

    public static boolean isGood(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=1; i<nums.length-1; i++){
            hm.put(i,1);
        }
        hm.put(nums.length-1,2);

        for(int i : nums){
            if(!hm.containsKey(i))return false;
            hm.put(i,hm.get(i)-1);
            if(hm.get(i) == 0) hm.remove(i);
        }

        return true;
    }
}
