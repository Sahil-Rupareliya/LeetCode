package contest;

import java.util.Scanner;

public class codeforces {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t --> 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            int h = sc.nextInt();
            int sum = c + h;
            if(sum+1 < b){
                System.out.println(sum+(sum+1));
            }else{
                System.out.println(b+(b-1));
            }
        }
    }

}
