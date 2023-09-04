package Matrix;

import java.util.Arrays;

public class LeetCode867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] temp = new int[matrix.length * matrix[0].length];
        int[][] ans = new int[matrix[0].length][matrix.length];
        int pointer = 0;
        for (int i=0; i< matrix[0].length; i++) {
            for(int j=0; j< matrix.length; j++){
                temp[pointer++] = matrix[j][i];
            }
        }
        pointer = 0;
        for (int i=0; i<matrix[0].length; i++){
            for (int j=0; j< matrix.length; j++){
                ans[i][j] = temp[pointer++];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
