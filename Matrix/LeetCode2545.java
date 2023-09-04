package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface LeetCode2545 {
    public static void main(String[] args) {
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        List<Integer> arrlist = new ArrayList<>();
        int[] arr = new int[score.length];
        int[][] ans = new int[score.length][score[0].length];
        for (int i = 0; i < score.length; i++) {
            arrlist.add(score[i][k]);
        }
        for (int i = 0; i < arrlist.size(); i++) {
            arr[i] = arrlist.indexOf(Collections.max(arrlist));
            arrlist.set(arr[i],Integer.MIN_VALUE); 
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                    ans[i][j] = score[arr[i]][j];
                    System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
