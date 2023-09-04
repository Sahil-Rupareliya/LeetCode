package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1089 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0};
        duplicateZeros(arr);

    }

    private static void duplicateZeros(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] == 0){
                end--;
            }
            start++;
        }

        if(end == arr.length-1){
            return;
        }
        for(int i=arr.length-1; i>=0 && end>=0; i--,end--){
            arr[i] = arr[end];
            if(arr[end] == 0 && end != start){
                arr[i-1] = 0;
                i--;
            }
        }
    }
}
