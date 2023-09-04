package Matrix;

public class LeetCode1582 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0,1},{1,0,0,0},{0,1,1,0},{0,0,0,0}};
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            int col = 0;
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                    col = j;
                    break;
                }
            }
            for(int k =0; k<mat[0].length; k++){
                sum += mat[i][k];
            }
            if(sum == 0){
                continue;
            }
            for(int k =0; k<mat.length; k++){
                if(k== i) {
                    continue;
                }else {
                    sum += mat[k][col];
                }
            }
            if(sum == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}
