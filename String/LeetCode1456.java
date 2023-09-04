package String;

public class LeetCode1456 {
    public static void main(String[] args) {
        String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k = 33;
//        System.out.println(s.length());
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        int count  = 0;
        int maxCount = 0;
        for(int i =0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
        }
        maxCount = Math.max(count,maxCount);
        for(int i=1; i<=s.length()-k; i++){
//            count = 0;
            char ch = s.charAt(i+k-1);
            if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u'){
                count++;
            }
            ch = s.charAt(i-1);
            if(ch == 'a' ||ch == 'e' ||ch == 'i'||ch == 'o'||ch == 'u' && count > 0){
                count--;
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}
