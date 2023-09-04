package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean arr2[]=new boolean[candies.length];
                int max = 0;
                List<Boolean> result = new ArrayList<>();
                for(int i=0; i<candies.length; i++){
                    if(candies[i] > max){
                        max = candies[i];
                    }
                }
                for(int i=0; i<candies.length; i++){
                    if(candies[i] + extraCandies >= max){
                        result.add(true);
                    }else{
                        result.add(false);
                    }
                }
            }
        }


