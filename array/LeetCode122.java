package array;

public class LeetCode122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int Profit = 0;
        for(int i=0; i<prices.length-1; i++){
            Profit += (prices[i] < prices[i+1]) ? prices[i+1]-prices[i] : 0;
        }
        return Profit;
    }
}
