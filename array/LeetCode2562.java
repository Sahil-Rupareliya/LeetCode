package array;

public class LeetCode2562 {
    public static void main(String[] args) {
        int[] nums = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            String s = String.valueOf(nums[left++]) + String.valueOf(nums[right--]);
            long a  = Integer.parseInt(s);
            sum += a;
        }
        if(nums.length % 2 != 0){
            sum += nums[nums.length/2];
        }
        return sum;
    }
}
