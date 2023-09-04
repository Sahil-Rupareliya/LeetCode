package HashMap;

import java.util.*;

public class LeetCode2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1,nums2));

    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ansList = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        List<Integer> list1 =  new ArrayList<>();
        List<Integer> list2 =  new ArrayList<>();
        for(int i: nums1){
            if(!set2.contains(i)){
                list1.add(i);
            }
        }
        ansList.add(0,list1);
        for(int i: nums2){
            if(!set1.contains(i)){
                list2.add(i);
            }
        }
        ansList.add(1,list2);
        return ansList;
    }
}
