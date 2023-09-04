package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode807 {
    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int[] arr = new int[grid[0].length];
        int[] arr2 = new int[grid[0].length];
        int n = grid.length;
        int sum = 0;
        int max2 = 0;
        for (int i=0; i<n; i++){
            for (int j = 0; j < grid.length; j++) {
                arr[i] = Math.max(arr[i],grid[i][j]);
                arr2[i] = Math.max(arr2[i],grid[j][i]);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sum  += (Math.min(arr[i],arr2[j])) - grid[i][j];
            }
        }
        System.out.println(sum);
    }

}
