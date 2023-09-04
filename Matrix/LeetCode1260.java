package Matrix;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1260 {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int[] arr = new int[grid.length * grid[0].length];
        List<List<Integer>> lists = new ArrayList<>();
        int k = 1;
        int index = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                arr[index] = grid[i][j];
                index++;
            }
        }
        int idx = 0;
        rotate(arr,k);
        for(int i = 0; i< grid.length; i++){
            ArrayList<Integer> arrlist = new ArrayList<>();
            for(int j=0; j<grid[i].length; j++){
                arrlist.add(arr[idx]);
                idx++;
            }
            lists.add(arrlist);
        }
    }

    public static void rotate(int[] arr, int d) {
        d = d % arr.length;
        reverseArr(arr, 0,arr.length-1);
        reverseArr(arr, 0,d-1);
        reverseArr(arr, d,arr.length-1);

    }
    public static void reverseArr(int[] arr ,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
