package Matrix;

import java.util.Arrays;

public class LeetCode1828 {
    public static void main(String[] args) {
        int[][] points= {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int count = 0;
            for(int j=0; j<points.length; j++){
                if((queries[i][0]-points[j][0])*(queries[i][0]-points[j][0])+
                   (queries[i][1]-points[j][1])* (queries[i][1]-points[j][1])
                        <=queries[i][2]*queries[i][2]){
                    count++;
                }
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
