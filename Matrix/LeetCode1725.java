package Matrix;

public class LeetCode1725 {
    public static void main(String[] args) {
        int[][] rectangles =  {{5,8},{3,9},{5,12},{16,5}};
        int[] ans = new int[rectangles.length];
        for(int i=0; i< rectangles.length; i++){
            ans[i] = Math.min(rectangles[i][0],rectangles[i][1]);
        }
        int max = 0;
        for(int i=0; i< ans.length; i++){
            if(ans[i] > max){
                max = ans[i];
            }
        }
        int count = 0;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] == max) count++;
        }
        System.out.println(count);
    }
}
