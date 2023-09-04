package contest;

import java.math.BigInteger;
import java.util.Arrays;

public class Contest1 {
    public static void main(String[] args) {
//        int[] nums = {31,25,72,79,74};
//        int count = 0;
//        for(int i=0; i<nums.length-1; i++){
//            for(int j=i+1; j<nums.length; j++){
//                int LastOfJ = nums[j]%10;
//                String s= String.valueOf(nums[i]);
//                int FirstOfI = s.charAt(0)-'0';
//                if(gcd(LastOfJ,FirstOfI)==1){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
        int[] nums = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));

    }
    public static  int gcd(int x,int y){
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
//        System.out.println(r);
        return r;
    }


    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0;  i<nums.length; i++){
            if(n%(i+1) ==0){
                int square = nums[i]*nums[i];
                ans += square;
            }
        }
        return ans;
    }
}

