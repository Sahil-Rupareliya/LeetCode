package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LeetCode2161 {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10}; //9,5,3,10,10,12,14
        int pivot = 10;
//----------------------------Simple---------------------------------------
//        int pointer = 0;
        int[] ans = new int[nums.length];
//        for (int i:nums) {
//            if(i < pivot){
//                ans[pointer++] = i;
//            }
//        }
//
//        for (int i:nums) {
//            if(i == pivot){
//                ans[pointer++] = i;
//            }
//        }
//
//        for (int i:nums) {
//            if(i > pivot){
//                ans[pointer++] = i;
//            }
//        }

//------------------------------------Two Pointer-----------------------------
        int left = 0;
        int right = nums.length-1;
        for(int i=0; i< nums.length; i++){
            if(nums[i] < pivot) ans[left++] = nums[i];
            if(nums[i] > pivot) ans[right--] = nums[i];
        }

        while(left <= right){
            ans[left++] = pivot;
            ans[right--] = pivot;
        }
        System.out.println(Arrays.toString(ans));
    }
}
