package Sorting;

public class LeetCode747 {
    public static void main(String[] args) {
        int nums[] = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }

    private static int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxidx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
                maxidx = i;
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        if(max1 == 2*max2){
            return maxidx;
        }
        return -1;
    }
}
