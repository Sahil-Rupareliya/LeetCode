package array;

import java.util.Arrays;

public class LeetCode2540 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};
        int first = 0;
        int second = 0;
        while(first < nums1.length && second < nums2.length){
            if(nums1[first] == nums2[second]){
                System.out.println(nums1[first]);
                return;
            }else if(nums1[first] > nums2[second]){
                second++;
            }else{
                first++;
            }
        }
        System.out.println(-1);

    }
}
