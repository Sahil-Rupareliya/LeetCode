package Matrix;

import java.util.Arrays;

public class LeetCode566 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int rpoint = 0;
        int cpoint = 0;
        int[][] ans = new int[r][c];
        for(int i=0; i< mat.length; i++){
            for (int j=0; j< mat[0].length; j++){
                ans[rpoint][cpoint++] = mat[i][j];
                if(cpoint == c) {
                    cpoint = 0;
                    rpoint++;
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
