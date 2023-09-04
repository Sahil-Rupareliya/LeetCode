//package Stack;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class LeetCode503 {
//    public static void main(String[] args) {
//        int[] nums = {1,2,1};
//        System.out.println(Arrays.toString(nums));
//    }
//
//    public static int[] nextGreaterElements(int[] nums) {
//        int[] ans = new int[nums.length];
//        Stack<Integer> stack = new Stack<>();
//        for(int i=nums.length-1; i>=0; i--){
//            if(stack.isEmpty()){
//                stack.push(nums[i]);
//            }else{
//                while(!stack.empty() && nums[i] > stack.peek()){
//                    stack.pop();
//                }
//            }
//        }
//    }
//}
