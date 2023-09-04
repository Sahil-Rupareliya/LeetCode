package String;

public class LeetCode2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s,letter));
    }

    public static int percentageLetter(String s, char letter) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return (count*100)/s.length();
    }
}
