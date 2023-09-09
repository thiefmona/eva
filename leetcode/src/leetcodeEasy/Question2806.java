package leetcodeEasy;

public class Question2806 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int a = purchaseAmount % 10;
        int b = purchaseAmount / 10;
        if (a >= 5) {
            b += 1;
        }

        return 100 - b * 10;
    }
}
