package String;

import java.util.Locale;

public class LeetCode1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != '#'){
                int a = Integer.parseInt(String.valueOf(s.charAt(i)))+96;
                sb.append((char)a);
            }else{
                String temp = "";
                temp += s.charAt(i-2);
                temp += s.charAt(i-1);
                int a = Integer.parseInt(temp) + 96;
                sb.append((char)a);
                i-=2;
            }
        }
        return sb.reverse().toString();
    }
}
