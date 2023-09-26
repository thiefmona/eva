package easy;

import java.util.Arrays;

public class Question2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int i = 0;
        int len = nums.length;
        int result = 0;
        while (i < len) {
            if (nums[i] > threshold || nums[i] % 2 != 0) {
                i++;
            } else {
                int left = i;
                i++;
                while (i < len && nums[i] <= threshold && nums[i - 1] <= threshold && nums[i] % 2 != nums[i - 1] % 2) {
                    i++;
                }
                int right = i - 1;
                result = Math.max(result, right - left + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4};
        int threshold = 1;
        System.out.println(new Question2760().longestAlternatingSubarray(nums, threshold));
    }
}
