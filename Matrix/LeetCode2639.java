package Matrix;

import java.util.Arrays;

public class LeetCode2639 {
    public static void main(String[] args) {
        int[][]  grid = {
            {-15,1,3},
            {15,7,12},
            {5,6,-2}};
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                String s = Integer.toString(grid[j][i]);
                int len = s.length();
                max = Math.max(max,len);
            }
            ans[i] = max;
        }
        System.out.println(Arrays.toString(ans));
    }
}
