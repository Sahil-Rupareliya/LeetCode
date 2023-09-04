package String;

public class LeetCode2586 {
    public static void main(String[] args) {
        String words[] = {"hey","aeo","mu","ooo","artro"};
        int count =0;
        for(int i=0; i<words.length; i++){
            if(vowelString(words[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean vowelString(String str){
        int len = str.length()-1;
        if((str.charAt(0) == 'a' ||
                str.charAt(0) == 'e'
                ||str.charAt(0) == 'i'
                ||str.charAt(0) == 'u'
                ||str.charAt(0) == 'o' )&&
                (str.charAt(len) == 'a' ||str.charAt(len) == 'e' ||str.charAt(len) == 'i' ||str.charAt(len) == 'o' ||str.charAt(len) == 'u')){
            return true;
        }
        return false;
    }
}
