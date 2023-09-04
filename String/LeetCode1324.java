package String;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1324 {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }


    public static List<String> printVertically(String s) {
        String[] str = s.split(" ");
        List<String> ansList = new ArrayList<>();
        int max = 0,maxidx = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].length() > max){
                max = str[i].length();
                maxidx = i;
            }
        }
        for(int i=0; i<max; i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0; j<str.length; j++){
                if(str[j].length()-1 < i ){
                    temp.append(" ");
                }else{
                    temp.append(str[j].charAt(i));
                }
            }
            ansList.add(trimRight(temp.toString()));
        }
        return ansList;
    }

    public static String trimRight(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        return s.substring(0, i + 1);
    }
}
