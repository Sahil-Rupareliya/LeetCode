package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LeetCode2643 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,1}};
        int max = 0;
        int maxidx = 0;
        int maxcount = 0;
        for(int i=0;i< mat.length;i++){
            int count = 0;
            for(int j=0; j<mat[i].length; j++){
                count++;
            }
            if(count > maxcount){
                maxcount = count;
                maxidx = i;
            }

        }
        int[] ans = {maxidx,max};
        System.out.println(Arrays.toString(ans));

    }
}
