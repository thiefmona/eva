package lc1400;

import java.util.Arrays;

public class Question2565 {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[nums.length-1] + i;
        }
        return sum;
    }
}
