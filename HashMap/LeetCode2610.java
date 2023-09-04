package HashMap;

import java.util.*;

public class LeetCode2610 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
            set.add(i);
        }

        while(!hm.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i:set){
                if(hm.containsKey(i)){
                    list.add(i);
                    hm.put(i, hm.get(i)-1);
                    if(hm.get(i) == 0)hm.remove(i);
                }

            }
            ans.add(list);
        }
        return ans;
    }
}
