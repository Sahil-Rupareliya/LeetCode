package String;

public class LeetCode824 {
    public static void main(String[] args) {
        String sentence = "I speak Goat Latin";
        System.out.println(toGoatLatin(sentence));
    }

    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("a");
        String[] arr = sentence.split(" ");
        for(int i=0; i<arr.length; i++){
            String temp = arr[i];
            temp = newString(temp);
            temp += sb2;
            sb.append(temp);
            sb.append(' ');
            sb2.append('a');
        }
        return sb.toString().trim();
    }

    public static String newString(String temp){
        char ch = temp.charAt(0);
        StringBuilder sb  = new StringBuilder();
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U'){
            sb.append(temp);
            sb.append("ma");
        }else{
            sb.append(temp.substring(1,temp.length()));
            sb.append(temp.charAt(0));
            sb.append("ma");
        }
        return sb.toString();
    }
}
