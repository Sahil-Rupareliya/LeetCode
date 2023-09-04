package String;

import java.util.Arrays;

public class LeetCode922 {
    public static void main(String[] args) {
            int[] nums = {4,2,5,7};
            int[] ans = sortArrayByParityII(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = 1;
        int[] ans =  new int[nums.length];
        for(int i:nums){
            if(i%2==0){
                nums[left] = i;
                left += 2;
            }else {
                nums[right] = i;
                right += 2;
            }
        }
        return nums;
    }
}
