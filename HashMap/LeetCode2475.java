package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2475 {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }

    public static int unequalTriplets(int[] nums) {
        int ans = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        if (map.size() < 3)return 0;
        for(int i: map.keySet()){
            ans *= map.get(i);
        }
        return ans;
    }
}
