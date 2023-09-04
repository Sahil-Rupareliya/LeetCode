package HashMap;
import  java.util.*;

public class LeetCode2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2}, nums2 = {2,3}, nums3 = {3};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }


    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int i: nums1){
            set.add(i);
        }

        for(int i: nums2){
            if(set.contains(i)){
                ans.add(i);
            }else{
                set2.add(i);
            }
        }

        for(int i: nums3){
            if(set.contains(i) || set2.contains(i)){
                ans.add(i);
            }
        }

        return new ArrayList(ans);
    }
}
