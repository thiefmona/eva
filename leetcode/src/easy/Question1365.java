package easy;

import java.util.Arrays;

public class Question1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 桶排序 数字最高为100
        int[] bucket = new int[101];
        for (int num : nums) {
            bucket[num] += 1;
        }
        int[] temp = new int[101];
        for (int i = 1; i < bucket.length; i++) {
            temp[i] = temp[i - 1] + bucket[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[nums[i]];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(new Question1365().smallerNumbersThanCurrent(nums)));
    }
}
