package Sorting;

import java.util.Arrays;

public class LeetCode1833 {
    public static void main(String[] args) {
        int[] costs = {2,3,3,5,6,6,6,7,9,10};
        int coins = 56;
        int ans = 0;
        Arrays.sort(costs);
        int sum =0;
        for(int i= 0; i<costs.length; i++){
            sum += costs[i];
            if(sum > coins){
                ans = i;
                break;
            }else if(sum == coins){
                ans =  i+1;
                break;
            }else if(sum <= coins && i == costs.length-1 ){
                ans = costs.length;
                break;
            }
        }
        System.out.println(ans);

    }
}
