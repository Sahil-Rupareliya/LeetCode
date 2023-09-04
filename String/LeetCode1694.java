package String;

public class LeetCode1694 {
    public static void main(String[] args) {
        String number = "123 4-567";
        System.out.println(reformatNumber(number));
    }

    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        number = number.replaceAll(" ", "").replaceAll("-", "");
        int len = number.length();
        int idx = 0;
        while (len > 4){
            for(int i=0; i<3; i++){
                sb.append(number.charAt(idx++));
                len--;
            }
            sb.append('-');
        }
        if(len < 4){
            for(int i=0; i<len; i++){
                sb.append(number.charAt(idx++));
            }
        }else{
            sb.append(number.charAt(idx++));
            sb.append(number.charAt(idx++));
            sb.append('-');
            sb.append(number.charAt(idx++));
            sb.append(number.charAt(idx++));
        }
        return sb.toString();
    }
}
