package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums =  {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int []array=new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                array[1] = i;
                array[0] = map.get(target - nums[i]);
                return array;
            }

            map.put(nums[i], i);
        }
        return array;
    }
}
