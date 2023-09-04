package Recursion.AddZeroQuestions;

//5. Count the digits of a given number using recursion
public class Q5 {
    public static void main(String[] args) {
        int n = 856543;
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n){
        if(n == 0){
            return 0;
        }

        return 1 + countDigit(n/10);
    }
}
