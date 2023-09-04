package Recursion.AddZeroQuestions;

public class Q6 {
    public static void main(String[] args) {
        int n = 6543;
//        System.out.println(reverse(n));
        reverse(n);
    }

    public static int reverse(int n){
        if(n == 0){
            return 0;
        }

        System.out.print(n% 10);
        return reverse(n/10);
    }
}
