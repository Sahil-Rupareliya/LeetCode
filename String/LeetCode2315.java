package String;

public class LeetCode2315 {
    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        boolean b = false;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|'){
                b = !b;
                continue;
            }
            if(s.charAt(i) == '*' && b==false){
                count++;
            }
        }
        return count;
    }
}
