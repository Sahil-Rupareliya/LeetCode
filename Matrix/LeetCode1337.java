package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode1337 {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k  =3;
        int[] ans = new int[k];
        List<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                    sum += mat[i][j];
            }
            arrlist.add(sum);
        }
//        int min = arrlist.get(0);
        for(int i=0; i<k; i++){
            ans[i] = arrlist.indexOf(Collections.min(arrlist));
            arrlist.set(ans[i],Integer.MAX_VALUE);
        }
        System.out.println(Arrays.toString(ans));

    }
}
