package array;

public class LeetCode1413 {
    public static void main(String[] args) {
        int[] nums = {1,-2,-3};
        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums) {
        int start = (nums[0] > 0) ? 1 : Math.abs(nums[0])+1;
        int curr = start;

        for(int i=0; i<nums.length; i++){
            int temp = curr + nums[i];
            if(temp < 1){
                curr += Math.abs(temp)+1;
                start += Math.abs(temp)+1;
                curr += nums[i];
            }else{
                curr += nums[i];
            }
        }
        return start;
    }
}
