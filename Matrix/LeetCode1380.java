package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1380 {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int[] arr = new int[matrix.length + matrix[0].length];
        for(int i=0; i< matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j< matrix[0].length; j++){
                if(matrix[i][j] <  min) min = matrix[i][j];
            }
            arr[i] = min;
        }
        for(int i=0;i< matrix[0].length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j< matrix.length; j++){
                if(matrix[j][i] > max); max = matrix[j][i];
            }
            arr[i+matrix.length] = max;

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        List<Integer> arrlist = new ArrayList<>();
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] == arr[i+1]) {
                System.out.println(arr[i]);
                arrlist.add(arr[i]);
                return;
            }
        }
    }
}
