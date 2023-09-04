package HashMap;

import java.util.Set;

public class LeetCode1796 {
    public static void main(String[] args) {
        String s = "abc1111";
        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        int max = -1;
        int max2 = -1;

        for(char ch: s.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                int temp = ch-'0';
                if(temp > max){
                    max2 = max;
                    max = temp;
                }else if(temp > max2 && temp != max){
                    max2 = temp;
                }
            }
        }
        return max2;
    }
}
