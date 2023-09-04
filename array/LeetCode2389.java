package array;

import java.util.Arrays;

public class LeetCode2389 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        int [] queries = {1};
        int[] arr = new int[queries.length];
        Arrays.sort(nums);
        for(int i=0; i<arr.length; i++){
            arr[i] = subSequence(nums, queries[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int subSequence(int[] arr, int queries){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > queries){
                return count;
            }
            count++;
        }
        return count;
    }
}
