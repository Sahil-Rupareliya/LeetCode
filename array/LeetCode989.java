package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {
    public static void main(String[] args) {
        int[] num = {0};
        int k = 23;
        int len = num.length-1;
        List<Integer> ans = new ArrayList<>();
        while(len >= 0 || k > 0){
            if(len >= 0){
                k += num[len];
                len--;
            }
            ans.add(0,k%10);
            k /= 10;
        }
        ans.forEach(System.out::print);
    }
}
