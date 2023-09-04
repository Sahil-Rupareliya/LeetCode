package array;

public class LeetCode2016 {
    public static void main(String[] args) {
        int[] nums = {9,4,3,2};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0; i< nums.length-1; i++){
            min = Math.min(min,nums[i]);
            ans = Math.max(ans,nums[i+1]-min);
        }
        return ans;
    }
}
