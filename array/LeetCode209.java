package array;

import java.util.Arrays;

public class LeetCode209 {
    public static void main(String[] args) {
        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int target = 213;
        System.out.println(minSubArrayLen(target, nums));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int count = 0;
        int ptr = nums.length-1;
        while(ptr >=0){
            target -= nums[ptr--];
            count++;
            if(target <= 0){
                return count;
            }
        }
        return 0;
    }
}
