package array;

public class LeetCode414 {
    public static void main(String[] args) {
        int[] nums = {1,2,-2147483648};
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        int len = nums.length-1;
        boolean b = false;
        while(len >= 0){
            if(nums[len] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[len--];
            }else if(nums[len] > max2 && nums[len] != max1 ){
                max3 = max2;
                max2 = nums[len--];
            }else if(nums[len] > max3 && nums[len] != max2 && nums[len] != max1){
                max3 = nums[len--];
            }else{
                len--;
            }

        }
        if(max3 ==Long.MIN_VALUE) System.out.println( (int)max1);
        else System.out.println( (int)max3);


    }
}
