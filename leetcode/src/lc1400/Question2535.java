package lc1400;

public class Question2535 {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int numberSum = 0;
        for (int num : nums) {
            elementSum += num;
            while (num > 0) {
                numberSum += num % 10;
                num = num / 10;
            }
        }
        return Math.abs(elementSum - numberSum);
    }
}
