package array;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                arr[k] = arr[i];
                k++;
            }
        }
        for(int i = k;i<arr.length; i++){
            arr[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
