package array;

public class LeetCode724 {
    public static void main(String[] args) {
        int[] nums = {-1,-1,0,1,1,0};
        int leftSum = 0;
        int rightSum = 0;
        int leftPtr = 0;
        int rightPtr = nums.length-1;

        for(int i=0; i< nums.length; i++){
            rightSum += nums[i];
        }

        for(int i=0; i< nums.length-1; i++){
            if(leftSum == rightSum){
                System.out.println(i);
                return;
            }else{
                leftSum += nums[i];
                rightSum -= nums[i+1];
            }
        }
        System.out.println(-1);
    }
}
