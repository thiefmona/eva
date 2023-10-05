package lc1400;

import java.util.Arrays;

public class Question2706 {
    public int buyChoco(int[] prices, int money) {
        // 数组排序
        Arrays.sort(prices);
        // 取出前两位 相加 判断
        return prices[0] + prices[1] > money ? money : money - prices[0] - prices[1];
    }
}
