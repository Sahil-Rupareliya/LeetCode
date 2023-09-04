package String;

public class LeetCode2414 {
    public static void main(String[] args) {
        String s = "yrpjofyzubfsiypfre";
        System.out.println(longestContinuousSubstring(s));
    }

    public static int longestContinuousSubstring(String s) {
        int count = 0;
        int tempCount = 0;
        for (int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)+1){
                    tempCount++;
            }else{
                tempCount = 0;
            }
            count = Math.max(count,tempCount);
        }
        return count+1;
    }
}
