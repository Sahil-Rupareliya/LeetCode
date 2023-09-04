package Matrix;

public class LeetCode1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,3,6,3},{3,5,7,3,5},{5,8,5,3,6},{7,4,8,9,4},{4,7,5,2,7}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j || (i+j) == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
