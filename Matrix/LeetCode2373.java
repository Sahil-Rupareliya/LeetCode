package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCode2373 {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] grid1 = new int[grid.length-2][grid[0].length-2];
        int[] arr = new int[4];
        int ptr = 0;
        for(int i=1; i< grid.length-1; i++){
            for(int j=1; j<grid[0].length-1; j++){
                int max = 0;
                ArrayList<Integer> arrlist = new ArrayList<>();
                arrlist.add(grid[i-1][j-1]);
                arrlist.add(grid[i-1][j]);
                arrlist.add(grid[i-1][j+1]);
                arrlist.add(grid[i][j-1]);
                arrlist.add(grid[i][j]);
                arrlist.add(grid[i][j+1]);
                arrlist.add(grid[i+1][j-1]);
                arrlist.add(grid[i+1][j]);
                arrlist.add(grid[i+1][j+1]);
                max = Collections.max(arrlist);
                arr[ptr] = max;
                ptr++;
            }

        }
        ptr = 0;
        for(int i=0;i< grid1.length;i++){
            for(int j=0; j<grid1[0].length; j++){
                grid1[i][j] = arr[ptr++];
            }
        }
        System.out.println(Arrays.deepToString(grid1));
    }
}
