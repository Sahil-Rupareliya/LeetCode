package array;

public class LeetCode1720 {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for(int i = 0; i< encoded.length; i++){
            ans[i+1] = ans[i] ^ encoded[i];
        }
        for (int i:ans) {
            System.out.print(i + " ");
        }
    }
}
