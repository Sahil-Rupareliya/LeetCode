package Matrix;

public class LeetCode2133 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{2,2}};
        for(int i=0;i< matrix.length; i++){
            int sum=0, sum2=0;
            for(int j=0; j< matrix.length; j++){
                sum += matrix[i][j];
                sum2 += matrix[j][i];
            }
            if(sum != sum2) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
