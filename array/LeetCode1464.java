package array;

public class LeetCode1464 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i : nums){
            if(i >= max1){
                max2 = max1;
                max1 = i;
            }else if(i >= max2){
                max2 = i;
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
