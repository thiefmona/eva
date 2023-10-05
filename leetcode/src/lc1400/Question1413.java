package lc1400;

public class Question1413 {
    public int minStartValue(int[] nums) {
        // 扫描数组 找出最小的和
        int sum = 0;
        int min = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(sum, min);
        }
        return min < 0 ? -min + 1 : 1;
    }
}
