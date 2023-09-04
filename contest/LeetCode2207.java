package contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2207 {
    public static void main(String[] args) {
        int[] nums= {1, 3, 3, 2};
        System.out.println(isGood(nums));
    }

    public static boolean isGood(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i] != i+1){
                return false;
            }
        }
        if(nums[n] != (n)){
            return false;
        }
        return true;
    }
}
