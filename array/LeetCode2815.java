package array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode2815 {
    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for(int i:  nums){
            int reverse = reverse(i);
            if(set.contains(reverse)){
                max = Math.max(max, i+reverse);
                set.remove(reverse);
            }else{
                set.add(i);
            }
        }
        return max;
    }

    public static int reverse(int n){
        int ans = 0;
        while (n != 0){
            int mod = n % 10;
            ans = ans*10 + mod;
            n /= 10;
        }
        return ans;
    }
}
