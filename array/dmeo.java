package array;

import java.util.Arrays;
import java.util.Scanner;

public class dmeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
        Arrays.sort(arr);

            int sum = 0;
            for(int i=n-l; i>=0; i-=k){
                sum += arr[i];
            }
            System.out.println(sum);
        }
//    }

}
