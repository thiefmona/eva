package mdeium;

import java.net.SocketTimeoutException;

public class Question0122 {
    public int maxProfit(int[] prices) {
        int i = 0;
        int len = prices.length;
        int sum = 0;
        while (i < len) {
            int left = i;
            i++;
            while (i < len && prices[i] > prices[i - 1]) {
                i++;
            }

            int right = i - 1;
            sum += prices[right] - prices[left];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new Question0122().maxProfit(prices));
    }
}
