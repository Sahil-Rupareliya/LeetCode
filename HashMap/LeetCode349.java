package HashMap;

import java.util.*;

public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set =  new HashSet<>();
        List<Integer> ansList = new ArrayList<>();

        for(int i: nums1){
            set.add(i);
        }

        for(int i: nums2){
            if(set.contains(i)){
                set.remove(i);
                ansList.add(i);
            }
        }

        int[] ans = new int[ansList.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = ansList.get(i);
        }
        return ans;
    }
}
