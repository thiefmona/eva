package leetcodeEasy;

import java.util.Arrays;

public class Question2733 {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        } else {
            Arrays.sort(nums);
            return nums[1];
        }
    }

    /**
     * 数组元素各不相同  所以一定在前三个中
     * @param nums
     * @return
     */
    public int findNonMinOrMaxGood(int[] nums) {
        if (nums.length < 3) {
            return -1;
        } else {
            Arrays.sort(nums);
            return nums[1];
        }
    }
}
