package Matrix;

public class LeetCode2614 {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{5,17,7},{9,11,10}};
        int maxPrime = 0;
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums[0].length; j++){
                if((i==j || i+j==nums.length-1) && (isPrime(nums[i][j]))){
                        maxPrime = Math.max(nums[i][j], maxPrime);
                }
            }
        }
        System.out.println(maxPrime);
    }

    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i*i <= num; i++){
            if(num%i ==0){
                return false;
            }
        }
        return  true;
    }
}
