package HashMap;
import java.util.*;

public class LeetCode2404 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums));
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums){
            if(i%2 ==0){
                hm.put(i, hm.getOrDefault(i,0)+1);
            }
        }
        int most_freq = 0;
        int minEle = -1;
        for(int i: hm.keySet()){
            if(hm.get(i) == most_freq){
                minEle = Math.min(minEle, i);
            }else if(hm.get(i) > most_freq){
                minEle = i;
                most_freq = hm.get(i);
            }
        }
        return minEle;
    }
}
