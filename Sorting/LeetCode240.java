package Sorting;

public class LeetCode240 {
    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        int target = 5;
        if(matrix[0][0] == target ) System.out.println(true);
        int raw = 0;
        int col = matrix[0].length-1;
        while(raw != matrix.length && col >= 0){
            if(matrix[raw][col] == target ){
                System.out.println(true);
                return;
            }else if(matrix[raw][col] > target){
                col--;
            }else{
                raw++;
            }
        }
        System.out.println(false);
    }
}
