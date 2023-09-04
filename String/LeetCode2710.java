package String;

import java.util.Locale;
import java.util.Stack;

public class LeetCode2710 {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));

    }

    public static String removeTrailingZeros(String num) {
        String sb = "";
        int count = 0;
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) > '0'){
                break;
            }
            if(num.charAt(i) == '0'){
                count++;
            }
        }


        return num.substring(0,num.length()-count);
    }
}
