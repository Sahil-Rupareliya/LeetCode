package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode2090 {
    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        int[] ans = new int[nums.length];
        int k = 3;
        int startPointer = 0;
        int endPointer = 2*k;
        long sum = 0;
        if(nums.length <= 2*k){
            Arrays.fill(ans,-1);
            return;
        }
        for(int i=0; i< (2*k)+1; i++){
            sum += nums[i];
        }
        System.out.println(sum);



        for(int i=0; i< nums.length; i++){
            if(i < k || i >= nums.length-k){
                ans[i] = -1;
            }else{
                ans[i] =(int) (sum / ((2 * k) + 1));
                if(i == nums.length-1-k) {
                    break;
                }
                sum = (sum - nums[i-k] + nums[i+ k+1]);
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
