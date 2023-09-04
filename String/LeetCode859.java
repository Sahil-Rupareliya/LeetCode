package String;

public class LeetCode859 {
    public static void main(String[] args) {
        String s = "aaaaaaabc", goal = "aaaaaaacb";


        System.out.println(buddyStrings(s,goal));

    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() == 1){
            return true;
        }else if(s.length() == 2){
            if(s.charAt(0)==goal.charAt(1) && s.charAt(1)==goal.charAt(0)) {
                return true;
            }else{
                return false;
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                sb.append(s.charAt(i));
                sb2.append(goal.charAt(i));
            }
        }

        if(sb.length() > 2){
            return false;
        }else{
            String x = sb.toString();
            String x1 = sb2.reverse().toString();
            if(x.equals(x1)){
                return true;
            }
        }
        return false;


    }
}
