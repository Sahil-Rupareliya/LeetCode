package Binary_Search;

public class LeetCode69 {
    public static void main(String[] args) {
        int x = 45;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        if(x < 2) return x;
        int left = 2;
        int right = x/2;

        while(left <= right){
            int mid = (left + right)/2;
            long sq = 1L * mid * mid;
            if(sq < x){
                left = mid+1;
            }else if(sq > x){
                right = mid-1;
            }else{
                return mid;
            }
        }
        return left;
    }
}


