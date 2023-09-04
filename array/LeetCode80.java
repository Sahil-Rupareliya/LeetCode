package array;

import java.util.Arrays;

public class LeetCode80 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int count = 0;
        int index = 1;
        for (int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 0;
            }
            if(count <= 1){
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println(index);
    }
}
