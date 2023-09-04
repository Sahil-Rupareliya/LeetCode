package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode739 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=temperatures.length-1; i>=0; i--){
            if(stack.empty()){
                stack.push(i);
                ans[i] = 0;
            }else{
                while (!stack.empty() && temperatures[stack.peek()] <= temperatures[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i] = 0;
                    stack.push(i);
                }else{
                    ans[i] = stack.peek()-i;
                    stack.push(i);
                }
            }
        }
        return ans;
    }

}

//[1,1,4,2,1,1,0,0]
