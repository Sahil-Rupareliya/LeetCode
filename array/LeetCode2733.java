package array;

public class LeetCode2733 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        if(nums.length <= 2){
            System.out.println(-1);
            return;
        }

        int first =  nums[0];
        int second =  nums[1];
        int third =  nums[2];
        int ans = 0;

        if((first > second && first < third) || first < second && first > third){
            ans = first;
        }else if((second < first && second > third) || (second > first && second < third)){
            ans =  second;
        }else{
            ans =  third;
        }
        System.out.println(ans);
    }
}
