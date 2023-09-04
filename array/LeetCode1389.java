package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
//        List<Integer> ans = new ArrayList<Integer>();
//        for(int i=0; i<arr.length; i++){
//            ans.add(index[i],arr[i]);
//        }
//        for(int i=0; i<arr.length; i++){
//            arr[i] = ans.get(i);
//        }
//        for (int i:arr) {
//            System.out.print(i + " ");
//        }
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        float height = A/10;
        float weight = B;
        double BMI = weight/(height*height);
        // BMI = Math.round(BMI*10)/10d;
        System.out.println(BMI);
    }
}
