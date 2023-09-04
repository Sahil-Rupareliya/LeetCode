package String;

import java.util.Arrays;

public class LeetCode2418 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        for(int i=0; i<heights.length-1; i++){
            for(int j=0; j< heights.length-i-1; j++){
                if(heights[j] < heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;

                    String temp1 = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp1;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
