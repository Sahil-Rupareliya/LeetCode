package Math;
public class LeetCode2169 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int count = 0;
        while(num1 !=0 && num2 !=0){
            if(num1 >= num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
            count++;
        }
        System.out.println(count);
    }
}
