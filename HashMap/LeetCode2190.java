package HashMap;
import  java.util.*;
public class LeetCode2190 {
    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        int key= 1;
        System.out.println(mostFrequent(nums,key));
    }

    public static int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] == key){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }

        int max = 0;
        int maxAns = 0;
        for(int i: map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                maxAns = i;
            }
        }
        return maxAns;
    }
}
