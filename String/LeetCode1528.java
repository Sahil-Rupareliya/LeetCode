package String;

import java.util.Scanner;

public class LeetCode1528 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans ="";
        char[] arr = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            int value = indices[i];
            arr[value] =  s.charAt(i);
        }
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
