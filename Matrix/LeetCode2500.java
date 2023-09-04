package Matrix;

import java.util.*;

public interface LeetCode2500 {

    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{3,3,1}};
        for(int i=0; i<grid.length; i++){
            Arrays.sort(grid[i]);
        }
        int ans =0;
        int col = grid[0].length-1;
        for(int i=col; i>=0; i--){
            int max = 0;
            for(int j=0; j<grid.length; j++){
                max = Math.max(max,grid[j][i]);
            }
            ans += max;
        }
        System.out.println(ans);
    }

}
