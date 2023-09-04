package array;

public class LeetCode2554 {
    public static void main(String[] args) {
        int[] banned = {11};
        int n = 7, maxSum = 50;
        int count =0;
        int range = Math.min(maxSum,n);
        int sum =0;
        for(int i=1; i<= range; i++){
            boolean flag = true;
            for(int j=0; j<banned.length; j++){
                if(i == banned[j] ){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
                count++;
            }
            if(sum > maxSum){
                count--;
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }
}