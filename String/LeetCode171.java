package String;

public class LeetCode171 {
    public static void main(String[] args) {
        String columnTitle = "FXSHRXW"; //6 24 19 8 18 24 23  //156  624 494 208 468 624 23
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int ans = (columnTitle.charAt(columnTitle.length()-1)+1 -'A');
        for(int i=columnTitle.length()-2; i>=0; i--){
            int temp = (columnTitle.charAt(i)+1 - 'A')*26;
            ans *= temp;
        }
        return ans ;
    }
}
