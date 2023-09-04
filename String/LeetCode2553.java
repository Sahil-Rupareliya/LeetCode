package String;

public class LeetCode2553 {
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        int num = Integer.parseInt(s);
        int[] arr = new int[s.length()];
        for(int i=s.length()-1; i>=0;i--){
            arr[i] = num % 10;
            num /= 10;
        }
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
