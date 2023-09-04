package Matrix;

public class ShortestPath {
    public static void main(String[] args) {
        int[][] matrix= {{2,4,6,3},{5,3,6,3},{6,4,9,3},{4,7,4,7}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==0 && j==0){
                    continue;
                }else if(i==0){
                    matrix[i][j] += matrix[i][j-1];
                }else if(j==0){
                    matrix[i][j] += matrix[i-1][j];
                }else{
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        System.out.println(matrix[matrix.length-1][matrix[0].length-1]);
    }
}
