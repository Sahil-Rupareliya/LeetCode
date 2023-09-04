package Recursion.AddZeroQuestions;

//4. Print the array elements using without loop
public class Q4 {
    public static void main(String[] args) {
        int[] arr = {2,43,6,3,2,6,8,4,9};
        print(arr,arr.length-1);
    }

    public static void print(int[] arr,int n){
        if(n < 0){
            return;
        }
        print(arr,n-1);
        System.out.println(arr[n]);
    }
}
