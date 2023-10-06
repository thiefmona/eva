package lc1400;

public class Question1827 {
    public int minOperations(int[] nums) {
        // 判断 i-1的值+1比i大还是小就行
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                int value = nums[i] + 1;
                count += value - nums[i + 1];
                nums[i + 1] = value;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Question1827().minOperations(new int[]{1, 5, 2, 4, 1}));
    }
}
