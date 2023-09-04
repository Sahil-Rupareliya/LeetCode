package String;

public class LeetCode1812 {
    public static void main(String[] args) {
        String coordinates = "h3";
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates) {
        int alpha = coordinates.charAt(0);
        int num = coordinates.charAt(1);

        if(alpha %2 != 0 && num%2==0){
            return true;
        }else if(alpha %2 != 0 && num%2!=0){
            return false;
        }else if(alpha %2 == 0 && num%2==0){
            return false;
        }else if(alpha %2 != 0 && num%2!=0){
            return true;
        }
        return true;
    }
}
