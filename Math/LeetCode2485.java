package Math;

public class LeetCode2485 {
    public static void main(String[] args) {
            int n = 47;
            int pointer = n;
            int x = 0;
            int sum = 0;
            while (x <= n){
                sum += ++x;
                if(sum == pointer && x+2 == n){
                    System.out.println(x+1);
                    return;
                }else if(sum > pointer){
                    pointer += --n;
                }
            }
        System.out.println(-1);
    }
}
