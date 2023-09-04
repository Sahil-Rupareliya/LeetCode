package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length-1;
        for(int i=0; i<nums.length; i++){
            int remainTarget  = 0-nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[left] + nums[right] == remainTarget){
                    Integer[] a1 = {nums[i], nums[left],nums[right]};
                    ans.add(Arrays.asList(a1));
                    left++;
                    right--;
                }else if (nums[left] + nums[right] > remainTarget){
                    right--;
                }else{
                    left++;
                }
                while (left <n && nums[left]==nums[left+1])left++;
                while (right >0 && nums[right]==nums[right-1])right--;
            }
            while (i < n && nums[i] == nums[i+1])i++;

        }
        return ans;
    }
}
