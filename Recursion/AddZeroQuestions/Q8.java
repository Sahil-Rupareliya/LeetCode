package Recursion.AddZeroQuestions;


//8. find the sum of digits of a number using recursion
public class Q8 {
    public static void main(String[] args) {
        int n = 787878;
        System.out.println(sumDigit(n));
    }

    public static int sumDigit(int n){
        if( n == 0){
            return 0;
        }
        return n%10 + sumDigit(n/10);
    }
}
