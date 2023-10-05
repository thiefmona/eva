package lc1400;

public class Question2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int sum = 0;
        for (int i = left.length - 2; i >= 0; i--) {
            sum += nums[i + 1];
            left[i] = sum;
        }
        sum = 0;
        int[] right = new int[nums.length];
        for (int i = 1; i < right.length; i++) {
            sum += nums[i - 1];
            right[i] = sum;
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Question2574().leftRightDifference(new int[]{10,4,8,3}));
    }
}
