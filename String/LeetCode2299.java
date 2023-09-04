package String;

public class LeetCode2299 {
    public static void main(String[] args) {
        String password = "IloveLe3tcode!";
        System.out.println(strongPasswordCheckerII(password));
    }

    public static boolean strongPasswordCheckerII(String password) {
        if (password.length() <9){
            return false;
        }
        String specialChar = "!@#$%^&*()-+";
        boolean digit = false;
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean symbol = false;
        for(int i=0; i<password.length(); i++){
            if(lowerCase== false && password.charAt(i) > 97 && password.charAt(i) < 123){
                lowerCase = true;
            }
            if(upperCase== false && password.charAt(i) > 64 && password.charAt(i) < 91){
                upperCase = true;
            }
            if(digit== false && password.charAt(i) > 47 && password.charAt(i) < 58){
                digit = true;
            }
            if(symbol== false && specialChar.indexOf(password.charAt(i))!= -1){
                symbol = true;
            }
        }
        System.out.println();
        if(digit == true && lowerCase == true && upperCase == true && symbol==true){
            return true;
        }
        return false;
    }
}
