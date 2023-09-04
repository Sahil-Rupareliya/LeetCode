package String;

import java.util.Arrays;
import java.util.Locale;

public class LeetCode2129 {
    public static void main(String[] args) {
        String title = "First leTTeR of EACH Word";
        System.out.println(capitalizeTitle(title));
    }


    public static String capitalizeTitle(String title) {
       title = title.toLowerCase();
       String[] arr = title.split(" ");
       String ans  = "";
       for(int i=0 ;i<arr.length; i++){
           if(arr[i].length() >2) {
               char[] ch = arr[i].toCharArray();
               ch[0] -= 32;
               ans += String.valueOf(ch) + " ";
           }else{
               ans += arr[i] +  " ";
           }
       }
       return ans.trim();
    }


}
