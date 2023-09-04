package Matrix;

import java.util.Arrays;


public class LeetCode1886 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat,target)) {
                System.out.println(true);
                return;
            }
            mat = rotate(mat);
        }
        System.out.println(false);
    }

    public static int[][] rotate(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i< mat.length; i++){
            int start = 0;
            int end = mat.length-1;
            while(start < end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}
