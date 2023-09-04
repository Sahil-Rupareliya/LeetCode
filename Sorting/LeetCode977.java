package Sorting;

import java.util.Arrays;

public class LeetCode977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = new int[nums.length];
        int left= 0;
        int right = nums.length-1;
        int pointer = nums.length-1;
        while(left <= right){
            int a = nums[left]* nums[left];
            int b = nums[right]* nums[right];
            if(a < b){
                ans[pointer--] = b;
                right--;
            }else{
                ans[pointer--] = a;
                left++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
