package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2089 {
    public static void main(String[] args) {
        int nums[] = {1,2,5,2,3};
        int target =2;
        List<Integer> list1 = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == target){
                list1.add(i);
            }
        }
        for(int i = 0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

    }
}
