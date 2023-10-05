package lc1400;

public class Question1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        // 枚举
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = Math.min(ans, Math.abs(start - i));
            }
        }
        return ans;
    }
}
