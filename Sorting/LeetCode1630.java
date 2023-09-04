package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1630 {
    public static void main(String[] args) {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, l = {0,1,6,4,8,7}, r = {4,4,9,7,9,10};
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<l.length; i++){
            int[] temp = new int[1+r[i]-l[i]];
            int idx = 0;
            for(int j=l[i]; j<=r[i]; j++){
                temp[idx++] = nums[j];
            }
            ans.add(checkArithmeticSubarrays(temp));
        }
        System.out.println(Arrays.toString(ans.toArray()));
    }

    private static boolean checkArithmeticSubarrays(int[] temp){
        Arrays.sort(temp);
        int diff = temp[1]-temp[0];
        for(int i=2; i< temp.length; i++){
            if(temp[i]-temp[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}
