package Recursion.AddZeroQuestions;

// 3. Sum of 1 to n numbers
public class Q3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    private static Integer sum(int n) {
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }


}
