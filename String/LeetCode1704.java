package String;

public class LeetCode1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvwsAreAlike(s));
    }

    private static boolean halvwsAreAlike(String s) {
        int len = s.length()/2;
        int count = 0;
        int count2 = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == 'A' || s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U' ||
               s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                count++;
            }
            if(s.charAt(i+len) == 'A' || s.charAt(i+len) == 'E' ||s.charAt(i+len) == 'I' ||s.charAt(i+len) == 'O' ||s.charAt(i+len) == 'U' ||
                    s.charAt(i+len) == 'a' ||s.charAt(i+len) == 'e' ||s.charAt(i+len) == 'i' ||s.charAt(i+len) == 'o' ||s.charAt(i+len) == 'u'){
                count2++;
            }
        }
        return (count==count2) ? true : false;
    }

}
