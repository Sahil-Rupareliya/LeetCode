package HashMap;

import java.util.*;

public class LeetCode2442 {
    public static void main(String[] args) {
        int[] nums = {2,2,2};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
            set.add(reverse(i));
        }
        return set.size();
    }

    public static int reverse (int n){
        int reverse = 0;
        while (n > 0){
            reverse = reverse*10 + (n%10);
            n /= 10;
        }
        return reverse;
    }
}
