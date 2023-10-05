package lc1400;

public class Question1475 {
    public int[] finalPrices(int[] prices) {
        // 嵌套循环
        for (int i = 0; i < prices.length; i++) {
            // 设置默认折扣值为0
            int disCount = 0;
            for (int j = i + 1; j < prices.length; j++) {
                // 找出第一个小于当前价格的值 作为折扣值
                // 找到后 立即跳出循环
                if (prices[j] <= prices[i]) {
                    disCount = prices[j];
                    break;
                }
            }
            // 原地修改
            prices[i] -= disCount;
        }
        return prices;
    }

    public static void main(String[] args) {
        System.out.println(new Question1475().finalPrices(new int[]{8,4,6,2,3}));
    }
}
