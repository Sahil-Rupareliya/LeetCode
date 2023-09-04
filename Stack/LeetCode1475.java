package Stack;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode1475 {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=prices.length-1; i>=0; i--){
            if(stack.isEmpty()){
                stack.push(prices[i]);
                ans[i] = prices[i];
            }else {
                while (!stack.isEmpty() && stack.peek() > prices[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = prices[i];
                    stack.push(prices[i]);
                } else {
                    ans[i] = prices[i] - stack.peek();
                    stack.push(prices[i]);
                }
            }
        }
        return ans;
    }
}
