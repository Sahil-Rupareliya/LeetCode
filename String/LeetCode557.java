package String;

public class LeetCode557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        int len = arr.length;
        for(int i=0; i<len; i++){
            ans.append(reverse(arr[i]));
        }
        ans.deleteCharAt(0);
        System.out.println(ans.toString());

    }

    private static String reverse(String s) {
        String x = " ";
        for (int i = s.length()-1; i >=0 ; i--) {
            x += s.charAt(i);
        }
        return x;
    }
}
