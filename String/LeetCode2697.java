package String;

public class LeetCode2697 {
    public static void main(String[] args) {
        String s = "egcfe";
        String ans = "";
        int mid = (s.length()-1)/2;
        int k=0;
        for (int i = 0; i <s.length() ; i++) {
            if(i <= mid){
                ans += s.charAt(i);
            }else{
                if(s.length()%2 ==0){
                    ans += s.charAt(mid-k);
                    k--;
                }else{
                    ans += s.charAt(mid);
                    k--;
                }

            }
        }

        System.out.println(ans);
    }
}
