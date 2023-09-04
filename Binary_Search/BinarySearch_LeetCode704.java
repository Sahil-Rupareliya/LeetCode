package Binary_Search;

public class BinarySearch_LeetCode704 {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                System.out.println(mid);
                return ;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(-1);
    }
}
