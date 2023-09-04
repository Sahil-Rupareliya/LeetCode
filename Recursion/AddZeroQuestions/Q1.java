package Recursion.AddZeroQuestions;

//1. 1.	Infinite recursive function
public class Q1 {

    public static void main(String[] args) {
        hello();
    }

    public  static void hello(){
        System.out.println("Hello");
        hello();
    }
}
