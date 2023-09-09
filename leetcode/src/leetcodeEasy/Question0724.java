package leetcodeEasy;

import java.util.Arrays;

public class Question0724 {
    public static int pivotIndex(int[] nums) {
        int[] mockNums = new int[nums.length + 2];
        mockNums[0] = 0;
        mockNums[mockNums.length - 1] = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            mockNums[i + 1] = nums[i];
            sum += nums[i];
        }

        int tempSum = 0;
        for (int i = 1; i < mockNums.length - 1; i++) {
            tempSum += mockNums[i - 1];
            if (sum - mockNums[i] == tempSum * 2) {
                return i - 1;
            }
        }
        return -1;
    }

    /**
     * 前缀和
     *
     * @param nums
     * @return
     */
    public static int pivotIndexGood(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int tempSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (tempSum * 2 + nums[i] == sum) {
                return i;
            }
            tempSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
