package String;

import java.util.Locale;

public class Assignment_Questions_8 {
    public static void main(String[] args) {
        String s = "aekiodr";
        String temp = "";
        for(int i=0; i<s.length(); i++){
            switch(s.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': continue;
                default : temp += s.charAt(i);
            }
        }
        s = temp;
        System.out.println(s);
    }
}
