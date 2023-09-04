package Matrix;

import java.util.Arrays;

public class LeetCode2482 {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1},{1,0,1},{0,0,1}};
        int[] arr = new int[grid.length + grid[0].length];
        int[][] ans = new int[grid.length][grid[0].length];
        for (int i=0 ;i< grid.length; i++){
            int rowCount = 0;
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    rowCount++;
                }
            }
            arr[i] = rowCount;

        }

        for(int i=0; i< grid[0].length; i++){
            int colCount= 0;
            for(int j=0; j< grid.length; j++){
                if(grid[j][i] == 1){
                    colCount++;
                }
            }
            arr[grid.length+i] = colCount;
        }
        int s1 = grid.length + grid[0].length;
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                int sum = arr[i] + arr[j+ ans.length];
                ans[i][j] = sum - (s1-sum);
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
