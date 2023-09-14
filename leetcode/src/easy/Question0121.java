package easy;

public class Question0121 {
    public int maxProfit(int[] prices) {
        int start = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= prices[start]) {
                start = i;
            } else {
                int temp = prices[i] - prices[start];
                profit = Math.max(temp, profit);
            }
        }
        return profit;
    }
}
