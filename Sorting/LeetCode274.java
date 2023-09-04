package Sorting;

import java.util.Arrays;

public class LeetCode274 {
    public static void main(String[] args) {
        int[] citations = {1,3,1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int max  = Integer.MIN_VALUE;
        for(int i: citations){
            if(i > max){
                max = i;
            }
        }

        int[] freq = new int[max+1];
        for(int i=0; i<citations.length; i++){
            freq[citations[i]]++;
        }

        System.out.println(Arrays.toString(freq));
        int greater = 0;
        for(int i=max; i>=0; i--){
            greater += freq[i];
            if(greater >= i){
                return  i;
            }
        }
        return 0;
    }
}
