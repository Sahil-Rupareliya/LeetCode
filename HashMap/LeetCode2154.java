package HashMap;

import java.util.*;

public class LeetCode2154 {
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums,original));
    }

    public static int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        while(set.contains(original)){
            original *= 2;
        }
        return original;
    }
}
