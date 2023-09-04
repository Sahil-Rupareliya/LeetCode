package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode2160 {
    public static void main(String[] args) {
        int num = 2687;
        int[] arr = new int[4];
        int i = 3;
        while(num > 0){
            arr[i--] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        int ans = (arr[0]* 10) + arr[1]*10 + arr[2] + arr[3];
        System.out.println(ans);
    }
}
