package Sorting;

import java.util.Arrays;

public class LeetCode1637 {
    public static void main(String[] args) {
        int[][] xpoints = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
        int[] temp = new int[xpoints.length];

        for(int i=0; i<xpoints.length; i++){
            temp[i] = xpoints[i][0];
        }

        Arrays.sort(temp);
        int max= Integer.MIN_VALUE;
        for(int i=1; i<temp.length; i++){
            int diff = temp[i]- temp[i-1];
            if(max < diff){
                max = diff;
            }
        }
        System.out.println(max);
    }
}
