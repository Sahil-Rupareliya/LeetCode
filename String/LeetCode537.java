package String;

public class LeetCode537 {
    public static void main(String[] args) {
        String num1 = "1+-125i", num2 = "1+-23i";
        System.out.println(complexNumberMultiply(num1,num2));
    }

    public static String complexNumberMultiply(String num1, String num2) {
        int real1 = Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int real2 = Integer.parseInt(num2.substring(0,num1.indexOf('+')));
        int image1 = Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.length()-1));
        int image2 = Integer.parseInt(num2.substring(num2.indexOf('+')+1,num2.length()-1));

        System.out.println(real1);
        System.out.println(real2);
        System.out.println(image1);
        System.out.println(image2);
        int real = (real1 * real2) + -(image1 * image2);
        int image = (image1 * real1) + (image1*image2);
        String ans = real + "+" + image + "i";
        return ans;
    }
}
