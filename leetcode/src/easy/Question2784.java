package easy;

import java.util.Arrays;

public class Question2784 {
    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int length = nums.length;
        if (nums[length - 1] != length - 1) {
            return false;
        }
        int[] temp = new int[length];
        for (int i = 0; i < nums.length - 1; i++) {
            temp[i] = i + 1;
        }
        temp[length - 1] = length - 1;
        return Arrays.equals(nums, temp);
    }

    public static void main(String[] args) {
        int[] nums={1, 3, 3, 2};
        isGood(nums);
    }
}
