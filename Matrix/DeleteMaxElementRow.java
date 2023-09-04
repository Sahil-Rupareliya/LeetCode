package Matrix;

import java.util.Arrays;
//  11. Delete max element from each row
public class DeleteMaxElementRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {2,3,5,3},
            {3,5,3,2},
            {4,5,3,6}};

        for(int i=0; i<matrix.length; i++){
            int max = 0;
            int maxidx = 0;
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] > max) {
                    maxidx = j;
                    max = matrix[i][j];
                }
            }
            for(int j=maxidx; j<matrix[0].length-1; j++){
                matrix[i][j] = matrix[i][j+1];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
