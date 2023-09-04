package String;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LeetCode2194 {
    public static void main(String[] args) {
        String s  = "K1:L2";
        List<String> ans = new ArrayList<>();
        for(int i=s.charAt(0); i<=s.charAt(3); i++){
            for(int j=s.charAt(1); j<=s.charAt(4); j++){
                String temp = "";
                temp += (char)i;
                temp += (char)j;
                ans.add(temp);
            }
        }
        System.out.println(ans);
    }
}
