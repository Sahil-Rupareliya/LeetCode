package array;

import java.util.Arrays;

public class LeetCode2022 {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m = 2,n =2,temp=0;
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                ans[i][j] = original[temp++];
            }
        }
        System.out.println(Arrays.deepToString(ans));

    }
}
