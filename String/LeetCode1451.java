package String;

public class LeetCode1451 {
    public static void main(String[] args) {
        String text = "Leetcode is cool";
        System.out.println(arrangeWords(text));
    }

    public static String arrangeWords(String text) {
        text = text.toLowerCase();
        String[] str =  text.split(" ");
        for(int i=0; i< str.length-1; i++){
            for(int j=0; j< str.length-1-i; j++){
                if(str[j].length() > str[j+1].length()){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        String ans = "";
        char[] ch = str[0].toCharArray();
        ch[0] -= 32;
        str[0] = String.valueOf(ch);
        ans = String.join(" ", str);
        System.out.println(ans);
        return ans;
    }
}
