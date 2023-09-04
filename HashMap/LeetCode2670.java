package HashMap;
import java.util.*;

class LeetCode2670 {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    static int[] distinctDifferenceArray(int[] nums) {
        Map<Integer, Integer> suffix = new HashMap<>();
        Map<Integer, Integer> prefix = new HashMap<>();
        int[] ans = new int[nums.length];
        int ptr = 0;

        for(int i: nums){
            suffix.put(i, suffix.getOrDefault(i,0)+1);
        }


        for(int i: nums){
            prefix.put(i, prefix.getOrDefault(i,0)+1);
            if(suffix.containsKey(i)){
                suffix.put(i,suffix.get(i)-1);
                if(suffix.get(i) == 0){
                    suffix.remove(i);
                }
            }
            ans[ptr++] = prefix.size() - suffix.size();
        }
        return ans;
    }
}
