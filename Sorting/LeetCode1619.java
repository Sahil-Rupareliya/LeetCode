package Sorting;

import java.util.Arrays;

public class LeetCode1619 {
    public static void main(String[] args) {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        Arrays.sort(arr);
        int remove = (arr.length*5)/100;
        double sum = 0;
        for(int i=remove; i<arr.length-remove; i++){
            sum += arr[i];
        }
        double ans = sum/(arr.length-(2*remove));
        System.out.println(ans);
    }
}
