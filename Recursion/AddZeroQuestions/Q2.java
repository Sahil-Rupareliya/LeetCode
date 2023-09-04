package Recursion.AddZeroQuestions;

// 2. Calculate the factorial of a number
public class Q2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));
    }

    private static Integer fact(int n) {
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }


}
