package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode728 {
    public static void main(String[] args) {
        int left = 1,right = 22;
        System.out.println(selfDividingNumbers(left,right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i>= right; i++){
            if(divide(i)) list.add(i);
        }
        return list;
    }

    public static boolean divide(int number){
        int temp = number;
        while(temp > 0){
            int mod = temp % 10;
            temp /= 10;
            if(mod == 0 || (number % mod) > 0){
                return false;
            }
        }
        return true;
    }
}
