package String;

public class LeetCode2264 {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger((num)));
    }

    public static String largestGoodInteger(String num) {
        String ans = "";
        char prev = '0';
        for(int i=1; i<num.length()-1; i++){
            if (num.charAt(i) == num.charAt(i-1) && num.charAt(i+1)== num.charAt(i)){
                if(prev < num.charAt(i)) {
                    ans = "";
                    ans += num.charAt(i);
                    ans += num.charAt(i);
                    ans += num.charAt(i);
                    prev = num.charAt(i);
                }
            }
        }
        return ans;
    }
}
