package Sorting;

public class LeetCode153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = (left+ right)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        System.out.println(nums[right]);
    }
}
