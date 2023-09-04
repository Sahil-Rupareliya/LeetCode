package array;

public class LeetCode2149 {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int i=0;
        int j=1;
        int[] ans = new int[nums.length];
        for(int l=0; l<nums.length; l++){
            if(nums[i] > 0){
                ans[i] = nums[l];
                i = i +2;
            }else{
                ans[j] = nums[l];
                j = j + 2;
            }
        }
        for (int x:ans) {
            System.out.println(x  + " ");
        }
    }
}
