package BitManupulation;

public class LeetCode1342 {
    public static void main(String[] args) {
        int num = 14;
        int count =0;
        while(num > 0){
            num = (num % 2 ==0) ? num/2 : num-1;
            count++;
        }
        System.out.println(count);

    }
}
